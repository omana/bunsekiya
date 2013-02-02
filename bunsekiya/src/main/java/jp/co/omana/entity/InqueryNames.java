package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Inquery}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/11/20 1:07:34")
public class InqueryNames {

    /**
     * inqueryIdのプロパティ名を返します。
     * 
     * @return inqueryIdのプロパティ名
     */
    public static PropertyName<Integer> inqueryId() {
        return new PropertyName<Integer>("inqueryId");
    }

    /**
     * inqueryDateのプロパティ名を返します。
     * 
     * @return inqueryDateのプロパティ名
     */
    public static PropertyName<String> inqueryDate() {
        return new PropertyName<String>("inqueryDate");
    }

    /**
     * nameKanjiのプロパティ名を返します。
     * 
     * @return nameKanjiのプロパティ名
     */
    public static PropertyName<String> nameKanji() {
        return new PropertyName<String>("nameKanji");
    }

    /**
     * nameKanaのプロパティ名を返します。
     * 
     * @return nameKanaのプロパティ名
     */
    public static PropertyName<String> nameKana() {
        return new PropertyName<String>("nameKana");
    }

    /**
     * companyのプロパティ名を返します。
     * 
     * @return companyのプロパティ名
     */
    public static PropertyName<String> company() {
        return new PropertyName<String>("company");
    }

    /**
     * divisionのプロパティ名を返します。
     * 
     * @return divisionのプロパティ名
     */
    public static PropertyName<String> division() {
        return new PropertyName<String>("division");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
    }

    /**
     * inqueryKindのプロパティ名を返します。
     * 
     * @return inqueryKindのプロパティ名
     */
    public static PropertyName<String> inqueryKind() {
        return new PropertyName<String>("inqueryKind");
    }

    /**
     * inqueryTextのプロパティ名を返します。
     * 
     * @return inqueryTextのプロパティ名
     */
    public static PropertyName<String> inqueryText() {
        return new PropertyName<String>("inqueryText");
    }

    /**
     * deadFlgのプロパティ名を返します。
     * 
     * @return deadFlgのプロパティ名
     */
    public static PropertyName<Integer> deadFlg() {
        return new PropertyName<Integer>("deadFlg");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _InqueryNames extends PropertyName<Inquery> {

        /**
         * インスタンスを構築します。
         */
        public _InqueryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _InqueryNames(final String name) {
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
        public _InqueryNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * inqueryIdのプロパティ名を返します。
         *
         * @return inqueryIdのプロパティ名
         */
        public PropertyName<Integer> inqueryId() {
            return new PropertyName<Integer>(this, "inqueryId");
        }

        /**
         * inqueryDateのプロパティ名を返します。
         *
         * @return inqueryDateのプロパティ名
         */
        public PropertyName<String> inqueryDate() {
            return new PropertyName<String>(this, "inqueryDate");
        }

        /**
         * nameKanjiのプロパティ名を返します。
         *
         * @return nameKanjiのプロパティ名
         */
        public PropertyName<String> nameKanji() {
            return new PropertyName<String>(this, "nameKanji");
        }

        /**
         * nameKanaのプロパティ名を返します。
         *
         * @return nameKanaのプロパティ名
         */
        public PropertyName<String> nameKana() {
            return new PropertyName<String>(this, "nameKana");
        }

        /**
         * companyのプロパティ名を返します。
         *
         * @return companyのプロパティ名
         */
        public PropertyName<String> company() {
            return new PropertyName<String>(this, "company");
        }

        /**
         * divisionのプロパティ名を返します。
         *
         * @return divisionのプロパティ名
         */
        public PropertyName<String> division() {
            return new PropertyName<String>(this, "division");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
        }

        /**
         * inqueryKindのプロパティ名を返します。
         *
         * @return inqueryKindのプロパティ名
         */
        public PropertyName<String> inqueryKind() {
            return new PropertyName<String>(this, "inqueryKind");
        }

        /**
         * inqueryTextのプロパティ名を返します。
         *
         * @return inqueryTextのプロパティ名
         */
        public PropertyName<String> inqueryText() {
            return new PropertyName<String>(this, "inqueryText");
        }

        /**
         * deadFlgのプロパティ名を返します。
         *
         * @return deadFlgのプロパティ名
         */
        public PropertyName<Integer> deadFlg() {
            return new PropertyName<Integer>(this, "deadFlg");
        }
    }
}