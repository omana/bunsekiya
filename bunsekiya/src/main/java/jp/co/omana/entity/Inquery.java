package jp.co.omana.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Inqueryエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/11/20 1:07:31")
public class Inquery implements Serializable {

    private static final long serialVersionUID = 1L;

    
    /** inqueryIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer inqueryId;

    /** inqueryDateプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String inqueryDate;

    /** nameKanjiプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String nameKanji;

    /** nameKanaプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String nameKana;

    /** companyプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String company;

    /** divisionプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String division;

    /** addressプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String address;

    /** inqueryKindプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String inqueryKind;

    /** inqueryTextプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String inqueryText;

    /** deadFlgプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer deadFlg;
}