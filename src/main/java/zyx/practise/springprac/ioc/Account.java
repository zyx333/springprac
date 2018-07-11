/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac.ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * inject collections and constructor
 */
public class Account {
    private String name;
    private String pwd;
    private List<String> cities;
    private Set<String> friends;
    private Map<Integer, String> books;
    private AccountDao accountDao;

    public Account(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public void setBooks(Map<Integer, String> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public List<String> getCities() {
        return cities;
    }

    public Set<String> getFriends() {
        return friends;
    }

    public Map<Integer, String> getBooks() {
        return books;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }
}

