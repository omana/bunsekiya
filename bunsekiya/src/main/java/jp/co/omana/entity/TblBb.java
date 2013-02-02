package jp.co.omana.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * TblBbエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/11/20 1:07:31")
public class TblBb implements Serializable {

    private static final long serialVersionUID = 1L;

    /** threadIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer threadId;

    /** TCatプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String TCat;

    /** TTitleプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String TTitle;

    /** TDateプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String TDate;

    /** TAdminFlgプロパティ */
    @Column(precision = 3, nullable = true, unique = false)
    public Byte TAdminFlg;

    @OneToMany(mappedBy = "tblBb")
    public List<TblRes> tblResList;

}