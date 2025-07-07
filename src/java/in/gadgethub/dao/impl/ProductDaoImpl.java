/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.ProductDao;
import in.gadgethub.pojo.ProductPojo;
import in.gadgethub.utility.DBUtil;
import in.gadgethub.utility.IDUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.tomcat.util.net.SSLHostConfigCertificate;

/**
 *
 * @author prashant yadav
 */
public class ProductDaoImpl implements ProductDao{

    //1.this method use for adding product into DB .
    @Override
    public String addProduct(ProductPojo product) {
        String status="Product Registration Faild!";
        if(product.getProdId()==null){
        product.setProdId(IDUtil.generateProdId());
        }
        
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement("insert into products values(?,?,?,?,?,?,?,?)");
            ps.setString(1, product.getProdId());
            ps.setString(2, product.getProdName());
            ps.setString(3, product.getProdType());
            ps.setString(4, product.getProdInfo());
            ps.setDouble(5, product.getProdPrice());
            ps.setInt(6, product.getProdQuantity());
            ps.setBlob(7, product.getProdImage());
            ps.setString(8, "Y");
           
            int count=ps.executeUpdate();
            if(count==1){
            status="Product added successfully with ID: "+product.getProdId();
            }
        } catch (SQLException ex) {
            System.out.println("Exception in addProduct "+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps);
        return status; 
    }

    //2.this method is used for update product on the basices of previous product
    @Override
    public String updateProduct(ProductPojo prevProduct, ProductPojo updatedProduct) {
        String status="Updation failed!";
        if(!prevProduct.getProdId().equals(updatedProduct.getProdId())){
            status="Product ID's Do Not Match. Updation Failed!";
            return status;
        }
        
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareCall("update products set PNAME=?,PTYPE=?,PINFO=?,PPRICE=?,PQUANTITY=?,IMAGE=? where PID=?");
            ps.setString(1, updatedProduct.getProdName());
            ps.setString(2, updatedProduct.getProdType());
            ps.setString(3, updatedProduct.getProdInfo());
            ps.setDouble(4, updatedProduct.getProdPrice());
            ps.setInt(5, updatedProduct.getProdQuantity());
            ps.setBlob(6, updatedProduct.getProdImage());
            ps.setString(7, updatedProduct.getProdId());
            
            int count =ps.executeUpdate();
            
            if(count==1){
            status="Product Update successfully";
            }
            
        } catch (SQLException ex) {
            System.out.println("Exception in updateProduct "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeStatement(ps);
         return status;
    }

    
    //3.this method use for update price only of that prodct
    @Override
    public String updateProductPrice(String prodId, double updatedPrice) {
        String status="Price updation failed!";
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        
        try {
            ps=conn.prepareStatement("update products set pprice=? where pid=?");
            ps.setDouble(1,updatedPrice);
            ps.setString(2, prodId);
            
            int count=ps.executeUpdate();
            if(count==1){
            status="Product price updated successfully";
            }
            
            
        }  catch (SQLException ex) {
            status="Error: "+ex.getMessage();
            System.out.println("Exception in updateProductPrice "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeStatement(ps);
         return status;
        
    }

    //4.get all product
    @Override
    public List<ProductPojo> getAllProducts() {
        Connection conn=DBUtil.provideConnection();
        List<ProductPojo> productList=new ArrayList<>();
        Statement st=null;
        ResultSet rs=null;
        try {
            st=conn.createStatement();
            rs=st.executeQuery("select * from products where available='Y' ");
            while(rs.next()){
            ProductPojo product=new ProductPojo();
            product.setProdId(rs.getString("pid"));
            product.setProdName(rs.getString("pname"));
            product.setProdPrice(rs.getDouble("pprice"));
            product.setProdType(rs.getString("ptype"));
            product.setProdInfo(rs.getString("pinfo"));
            product.setProdQuantity(rs.getInt("pquantity"));
            product.setProdImage(rs.getAsciiStream("image"));
            productList.add(product);
            }
            
            
        }catch (SQLException ex) {
            System.out.println("Exception in getAllProducts "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(st);
        return productList;
    }
    //5.get all product by type.kuch leter word se mil jai to productList return kr de

    @Override
    public List<ProductPojo> getAllProductsByType(String type) {
      Connection conn=DBUtil.provideConnection();
        List<ProductPojo> productList=new ArrayList<>();
       PreparedStatement ps=null;
        ResultSet rs=null;
        type=type.toLowerCase();
        try {
            ps=conn.prepareStatement("select * from products where lower(ptype) like ? and available='Y'");
            ps.setString(1, "%"+type+"%");
            rs=ps.executeQuery();
            while(rs.next()){
            ProductPojo product=new ProductPojo();
            product.setProdId(rs.getString("pid"));
            product.setProdName(rs.getString("pname"));
            product.setProdPrice(rs.getDouble("pprice"));
            product.setProdType(rs.getString("ptype"));
            product.setProdInfo(rs.getString("pinfo"));
            product.setProdQuantity(rs.getInt("pquantity"));
            product.setProdImage(rs.getAsciiStream("image"));
            productList.add(product);
            }
            
            
        }catch (SQLException ex) {
            System.out.println("Exception in getAllProductsByType "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return productList;
    }

    
    //6.search product byType,byName,byInfo
    @Override
    public List<ProductPojo> searchAllProducts(String searchTerm) {
         Connection conn=DBUtil.provideConnection();
        List<ProductPojo> productList=new ArrayList<>();
       PreparedStatement ps=null;
        ResultSet rs=null;
        searchTerm=searchTerm.toLowerCase();
        try {
            ps=conn.prepareStatement("select * from products where lower(ptype) like ? or lower(pname) like ? or lower(pinfo) like ? and available='Y'");
            ps.setString(1, "%"+searchTerm+"%");
            ps.setString(2, "%"+searchTerm+"%");
            ps.setString(3, "%"+searchTerm+"%");
            rs=ps.executeQuery();
            while(rs.next()){
            ProductPojo product=new ProductPojo();
            product.setProdId(rs.getString("pid"));
            product.setProdName(rs.getString("pname"));
            product.setProdPrice(rs.getDouble("pprice"));
            product.setProdType(rs.getString("ptype"));
            product.setProdInfo(rs.getString("pinfo"));
            product.setProdQuantity(rs.getInt("pquantity"));
            product.setProdImage(rs.getAsciiStream("image"));
            productList.add(product);
            }
            
            
        }catch (SQLException ex) {
            System.out.println("Exception in getAllProductsByType "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return productList;
    }

    
    //7.get product details on the basic of prodId
    @Override
    public ProductPojo getProductDetails(String prodId) {
         Connection conn= DBUtil.provideConnection();
         PreparedStatement ps=null;
         ResultSet rs=null;
         ProductPojo product=null;
         
         try {
             ps=conn.prepareStatement("Select * from products where pid=?");
             ps.setString(1, prodId);
             rs=ps.executeQuery();
             if(rs.next()){
             product=new ProductPojo();
             product.setProdId(rs.getString("pid"));
             product.setProdName(rs.getString("pname"));
             product.setProdPrice(rs.getDouble("pprice"));
             product.setProdType(rs.getString("ptype"));
             product.setProdInfo(rs.getString("pinfo"));
             product.setProdQuantity(rs.getInt("pquantity"));
             product.setProdImage(rs.getAsciiStream("image"));
             }
            
        }catch (SQLException ex) {
            System.out.println("Exception in getProductDetails "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return product;
    }

    
    //8.get product Quantity
    @Override
    public int getProductQuantity(String prodId) {
        int quantity=0;
        Connection conn= DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement("select pquantity from products where pid=?");
            ps.setString(1, prodId);
            rs=ps.executeQuery();
            if(rs.next()){
            quantity=rs.getInt(1);
            }
            
            
        }catch (SQLException ex) {
            System.out.println("Exception in getProductQuantity "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return quantity;
    }

    
    //9.update product without image 
    @Override
    public String updateProductWithoutImage(String prevProductId, ProductPojo updatedProduct) {
        String status="Updation failed!";
        int prevQuantity=0;
        if(!prevProductId.equals(updatedProduct.getProdId())){
            status="Product ID's Do Not Match. Updation Failed!";
            return status;
        }
        
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try {
            prevQuantity=getProductQuantity(prevProductId);
        
            ps=conn.prepareCall("update products set PNAME=?,PTYPE=?,PINFO=?,PPRICE=?,PQUANTITY=? where PID=?");
            ps.setString(1, updatedProduct.getProdName());
            ps.setString(2, updatedProduct.getProdType());
            ps.setString(3, updatedProduct.getProdInfo());
            ps.setDouble(4, updatedProduct.getProdPrice());
            ps.setInt(5, updatedProduct.getProdQuantity());
            ps.setString(6, updatedProduct.getProdId());
            
            int count =ps.executeUpdate();
            
            if(count==1 && prevQuantity<updatedProduct.getProdQuantity()){
            status="Proudct updated successfully and MAIL send";
            
            // code for sending mail 
            }else if(count==1){
            status="Product Update successfully";
            }
            
        } catch (SQLException ex) {
            System.out.println("Exception in updateProductWithoutImage  "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeStatement(ps);
         return status;
    }

    
    //10.get  product price 
    @Override
    public double getProductPrice(String prodId) {
       double price=0.0;
        Connection conn= DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement("select pprice from products where pid=?");
            ps.setString(1, prodId);
            rs=ps.executeQuery();
            if(rs.next()){
            price=rs.getDouble(1);
            }
  
        }catch (SQLException ex) {
            System.out.println("Exception in getProductPrice "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return price;
    }

    
    //11.exestion product quentity me se n-quantity substract kro
    @Override
    public boolean sellNProduct(String prodId, int n) {
        boolean result=false;
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement("update products set  pquantity=(pquantity-?) where pid=? and available='Y'");
            ps.setDouble(1,n);
            ps.setString(2, prodId);
            
            int count=ps.executeUpdate();
            if(count==1){
           result=true;
            }
            
            
        }  catch (SQLException ex) {
           System.out.println("Exception in sellNProduct "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeStatement(ps);
         return result;
    }

    
    //12.get all product type
    @Override
    public List<String> getAllProductsType() {
        List<String>productTypeList=new ArrayList<>();
        Connection conn=DBUtil.provideConnection();
        Statement st=null;
        ResultSet rs=null;
        try {
            st=conn.createStatement();
            rs=st.executeQuery("select distinct ptype from products where available='Y'");
            while(rs.next()){
            productTypeList.add(rs.getString(1));
            }
            
            
        }  catch (SQLException ex) {
           System.out.println("Exception in getAllProductsType "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeStatement(st);
         DBUtil.closeResultSet(rs);
         return productTypeList;
    }

    
    //13. get image in the form of byte
    @Override
    public byte[] getImage(String prodId) {
        byte[]arr=null;
        Connection conn= DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement("select image from products where pid=?");
            ps.setString(1, prodId);
            rs=ps.executeQuery();
            if(rs.next()){
            arr=rs.getBytes(1);
            }
  
        }catch (SQLException ex) {
            System.out.println("Exception in getImage "+ex);
            ex.printStackTrace();
        }
         DBUtil.closeResultSet(rs);
         DBUtil.closeStatement(ps);
        return arr;
    }

    @Override
    public String removeProduct(String prodId) {
        String status="Product not found!";
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        try{
            ps1=conn.prepareStatement("Update products set available='N' where pid=? and available='Y'");
            ps1.setString(1, prodId);
            int k=ps1.executeUpdate();
            if(k>0){
                status="Product Removed Successfully!";
                ps2=conn.prepareStatement("Delete from usercart where prodid=?");
                ps2.setString(1, prodId);
                k=ps2.executeUpdate();                
            }            
        }catch(SQLException ex){
            status="Error:"+ex.getMessage();
            System.out.println("Error in removeProduct:"+ex);
            ex.printStackTrace();
        } 
        DBUtil.closeStatement(ps1);
        DBUtil.closeStatement(ps2);
        return status;
    }    
    
}
