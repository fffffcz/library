package library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String readerName;
    private String phoneNum; //电话号码作为登陆账号
    private Float account;
    private String email;
    private Integer borrowQuota; //借阅额度，共3本

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Float getAccount() {
        return account;
    }

    public void setAccount(Float account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBorrowQuota() {
        return borrowQuota;
    }

    public void setBorrowQuota(Integer borrowQuota) {
        this.borrowQuota = borrowQuota;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", readerName='" + readerName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", account=" + account +
                ", email='" + email + '\'' +
                ", borrowQuota=" + borrowQuota +
                '}';
    }
}
