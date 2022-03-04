/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ADMIN
 */
import java.sql.SQLException;
import Document.Book;
import Document.Jounary;
import Document.Newspaper;
import java.util.List;
import ConnectionJDBC.UserDao;
import Document.Document;

/**
 *
 * @author kvan2
 */
public class UserService {
    private UserDao userDao;
    
    public UserService(){
        userDao=new UserDao();
    }
    
    public List<Jounary> getAllJounary(){
        return userDao.getAllJounary();
    }
    public List<Book> getALLBOOK(){
        return userDao.getALLBOOK();
    }
    public List<Newspaper> getALLNewspaper(){
        return userDao.getALLNewspaper();
    }
    public List<Document> getAllDocument(){
        return userDao.getAllDocument();
    }
    public void addBook(Book book){
        userDao.addBook(book);
    }
    public void addJounary(Jounary jounary){
        userDao.addJounary(jounary);
    }
    public void addNewspaper(Newspaper newspaper){
        userDao.addNewspaper(newspaper);
    }
    public void DeleteDocument(int id){
        userDao.DeleteDocument(id);
    }
    public List<Jounary> FindJounary(String IdTaiLieu){
        return userDao.FindJounary(IdTaiLieu);
    }
    public List<Book> FindBOOK(String IdTaiLieu){
        return userDao.FindBOOK(IdTaiLieu);
    }
    public List<Newspaper> FindNewspaper(String IdTaiLieu){
        return userDao.FindNewspaper(IdTaiLieu);
    }
}
