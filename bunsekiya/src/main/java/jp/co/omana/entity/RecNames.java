package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Rec}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2013/07/14 19:28:22")
public class RecNames {

    /**
     * recIdのプロパティ名を返します。
     * 
     * @return recIdのプロパティ名
     */
    public static PropertyName<Integer> recId() {
        return new PropertyName<Integer>("recId");
    }

    /**
     * recDateのプロパティ名を返します。
     * 
     * @return recDateのプロパティ名
     */
    public static PropertyName<String> recDate() {
        return new PropertyName<String>("recDate");
    }

    /**
     * recTimeのプロパティ名を返します。
     * 
     * @return recTimeのプロパティ名
     */
    public static PropertyName<Integer> recTime() {
        return new PropertyName<Integer>("recTime");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _RecNames extends PropertyName<Rec> {

        /**
         * インスタンスを構築します。
         */
        public _RecNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _RecNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _RecNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * recIdのプロパティ名を返します。
         *
         * @return recIdのプロパティ名
         */
        public PropertyName<Integer> recId() {
            return new PropertyName<Integer>(this, "recId");
        }

        /**
         * recDateのプロパティ名を返します。
         *
         * @return recDateのプロパティ名
         */
        public PropertyName<String> recDate() {
            return new PropertyName<String>(this, "recDate");
        }

        /**
         * recTimeのプロパティ名を返します。
         *
         * @return recTimeのプロパティ名
         */
        public PropertyName<Integer> recTime() {
            return new PropertyName<Integer>(this, "recTime");
        }
    }
}