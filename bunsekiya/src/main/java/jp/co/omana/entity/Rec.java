package jp.co.omana.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Recエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/11/20 1:07:31")
public class Rec implements Serializable {

    private static final long serialVersionUID = 1L;

    /** recIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer recId;

    /** recDateプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String recDate;

    /** recTimeプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer recTime;
}