package jp.co.omana.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * TblResエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/11/20 1:07:31")
public class TblRes implements Serializable {

    private static final long serialVersionUID = 1L;

    /** threadIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer threadId;

    /** resIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer resId;

    /** RDateプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String RDate;

    /** RWriterプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String RWriter;

    /** RAddressプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String RAddress;

    /** RContextプロパティ */
    @Lob
    @Column(length = 65535, nullable = false, unique = false)
    public String RContext;

    /** RAllowFlgプロパティ */
    @Column(precision = 3, nullable = true, unique = false)
    public Byte RAllowFlg;

    @ManyToOne
    @JoinColumn(name="THREAD_ID", referencedColumnName="THREAD_ID")
    public TblBb tblBb;

}