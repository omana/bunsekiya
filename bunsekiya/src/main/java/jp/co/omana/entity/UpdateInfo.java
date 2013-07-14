package jp.co.omana.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * UpdateInfoエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2013/07/14 19:28:19")
public class UpdateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** autoNumプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer autoNum;

    /** yyyymmddプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String yyyymmdd;

    /** infoContextプロパティ */
    @Column(length = 600, nullable = false, unique = false)
    public String infoContext;
}