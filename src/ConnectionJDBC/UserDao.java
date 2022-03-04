/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionJDBC;
import Document.Book;
import Document.Document;
import Document.Jounary;
import Document.Newspaper;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class UserDao {
      public List<Document> getAllDocument(){
        List<Document> Documents= new ArrayList<Document>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Document document=new Document();
                document.setIdTaiLieu(rs.getString("IdTaiLieu"));
                document.setNameNXB(rs.getString("NameNXB"));
                document.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                document.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                
              
                
                Documents.add(document);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Documents;
        }
      public List<Jounary> getAllJounary(){
        List<Jounary> Jounarys= new ArrayList<Jounary>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Jounary'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Jounary jounary=new Jounary();
                jounary.setIdTaiLieu(rs.getString("IdTaiLieu"));
                jounary.setNameNXB(rs.getString("NameNXB"));
                jounary.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                jounary.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                jounary.setId(rs.getInt("IDPH"));
                jounary.setMonth(rs.getInt("Month"));
              
                
                Jounarys.add(jounary);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Jounarys;
        }
      
        public List<Jounary> FindJounary(String IdTaiLieu){
        List<Jounary> Jounarys= new ArrayList<Jounary>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Jounary' and  IdTaiLieu=IdTaiLieu";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Jounary jounary=new Jounary();
                jounary.setIdTaiLieu(rs.getString("IdTaiLieu"));
                jounary.setNameNXB(rs.getString("NameNXB"));
                jounary.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                jounary.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                jounary.setId(rs.getInt("IDPH"));
                jounary.setMonth(rs.getInt("Month"));
              
                
                Jounarys.add(jounary);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Jounarys;
        }
      
        
      public List<Book> getALLBOOK(){
        List<Book> Books= new ArrayList<Book>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Book'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Book book=new Book();
                book.setIdTaiLieu(rs.getString("IdTaiLieu"));
                book.setNameNXB(rs.getString("NameNXB"));
                book.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                book.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                book.setNameAuthor(rs.getString("nameAuthor"));
                book.setPage(rs.getInt("Page"));
               
                
                Books.add(book);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Books;
        }
      
        public List<Book> FindBOOK(String IdTaiLieu){
        List<Book> Books= new ArrayList<Book>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Book' and  IdTaiLieu=IdTaiLieu";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Book book=new Book();
                book.setIdTaiLieu(rs.getString("IdTaiLieu"));
                book.setNameNXB(rs.getString("NameNXB"));
                book.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                book.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                book.setNameAuthor(rs.getString("nameAuthor"));
                book.setPage(rs.getInt("Page"));
               
                
                Books.add(book);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Books;
        }
      
      public List<Newspaper> getALLNewspaper(){
        List<Newspaper> Newspapers= new ArrayList<Newspaper>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Newspapers'";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Newspaper newspaper=new Newspaper();
                newspaper.setIdTaiLieu(rs.getString("IdTaiLieu"));
                newspaper.setNameNXB(rs.getString("NameNXB"));
                newspaper.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                newspaper.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                newspaper.setDate(rs.getString("Date"));
                
                
                Newspapers.add(newspaper);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Newspapers;
        }
      
        public List<Newspaper> FindNewspaper(String IdTaiLieu){
        List<Newspaper> Newspapers= new ArrayList<Newspaper>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM QLSACH Where LoaiTaiLieu='Newspapers' and IdTaiLieu=IdTaiLieu";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Newspaper newspaper=new Newspaper();
                newspaper.setIdTaiLieu(rs.getString("IdTaiLieu"));
                newspaper.setNameNXB(rs.getString("NameNXB"));
                newspaper.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                newspaper.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                newspaper.setDate(rs.getString("Date"));
                
                
                Newspapers.add(newspaper);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return Newspapers;
        }
      
      public void addBook(Book book){
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql="Insert into QLSACH(IdTaiLieu,LoaiTaiLieu,NameNXB,SoBanPhatHanh,NameAuthor,Page) VALUES(?,?,?,?,?,?)";
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, book.getIdTaiLieu());
           preparedStatement.setString(2, book.getLoaiTaiLieu());
           preparedStatement.setString(3, book.getNameNXB());
           preparedStatement.setInt(4, book.getSoBanPhatHanh());
           preparedStatement.setString(5, book.getNameAuthor());
           preparedStatement.setInt(6, book.getPage());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public void addJounary(Jounary jounary){
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql="Insert into QLSACH(IdTaiLieu,LoaiTaiLieu,NameNXB,SoBanPhatHanh,idPH,month) VALUES(?,?,?,?,?,?)";
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, jounary.getIdTaiLieu());
           preparedStatement.setString(2, jounary.getLoaiTaiLieu());
           preparedStatement.setString(3, jounary.getNameNXB());
           preparedStatement.setInt(4, jounary.getSoBanPhatHanh());
           preparedStatement.setInt(5, jounary.getId());
           preparedStatement.setInt(6, jounary.getMonth());
           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public void addNewspaper(Newspaper newspaper){
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql="Insert into QLSACH(IdTaiLieu,LoaiTaiLieu,NameNXB,SoBanPhatHanh,Date) VALUES(?,?,?,?,?)";
        try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, newspaper.getIdTaiLieu());
           preparedStatement.setString(2, newspaper.getLoaiTaiLieu());
           preparedStatement.setString(3, newspaper.getNameNXB());
           preparedStatement.setInt(4, newspaper.getSoBanPhatHanh());
           preparedStatement.setString(5, newspaper.getDate());

           int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch (SQLException e){
                e.printStackTrace();
        }
    }
      public void DeleteDocument(int id){
         Connection connection = ConnectionJDBC.getJDBCConnection();
         String sql="delete from QLSACH where IdTaiLieu = ?";
         try {
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setInt(1, id);
             int rs=preparedStatement.executeUpdate();
             System.out.println(rs);
         }catch (SQLException e){
                e.printStackTrace();
        }
    }
}
