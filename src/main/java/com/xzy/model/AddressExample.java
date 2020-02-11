package com.xzy.model;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserhomeIsNull() {
            addCriterion("userhome is null");
            return (Criteria) this;
        }

        public Criteria andUserhomeIsNotNull() {
            addCriterion("userhome is not null");
            return (Criteria) this;
        }

        public Criteria andUserhomeEqualTo(String value) {
            addCriterion("userhome =", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeNotEqualTo(String value) {
            addCriterion("userhome <>", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeGreaterThan(String value) {
            addCriterion("userhome >", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeGreaterThanOrEqualTo(String value) {
            addCriterion("userhome >=", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeLessThan(String value) {
            addCriterion("userhome <", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeLessThanOrEqualTo(String value) {
            addCriterion("userhome <=", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeLike(String value) {
            addCriterion("userhome like", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeNotLike(String value) {
            addCriterion("userhome not like", value, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeIn(List<String> values) {
            addCriterion("userhome in", values, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeNotIn(List<String> values) {
            addCriterion("userhome not in", values, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeBetween(String value1, String value2) {
            addCriterion("userhome between", value1, value2, "userhome");
            return (Criteria) this;
        }

        public Criteria andUserhomeNotBetween(String value1, String value2) {
            addCriterion("userhome not between", value1, value2, "userhome");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNull() {
            addCriterion("rec_name is null");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNotNull() {
            addCriterion("rec_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecNameEqualTo(String value) {
            addCriterion("rec_name =", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotEqualTo(String value) {
            addCriterion("rec_name <>", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThan(String value) {
            addCriterion("rec_name >", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("rec_name >=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThan(String value) {
            addCriterion("rec_name <", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThanOrEqualTo(String value) {
            addCriterion("rec_name <=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLike(String value) {
            addCriterion("rec_name like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotLike(String value) {
            addCriterion("rec_name not like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameIn(List<String> values) {
            addCriterion("rec_name in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotIn(List<String> values) {
            addCriterion("rec_name not in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameBetween(String value1, String value2) {
            addCriterion("rec_name between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotBetween(String value1, String value2) {
            addCriterion("rec_name not between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andRecPhoneIsNull() {
            addCriterion("rec_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecPhoneIsNotNull() {
            addCriterion("rec_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecPhoneEqualTo(String value) {
            addCriterion("rec_phone =", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneNotEqualTo(String value) {
            addCriterion("rec_phone <>", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneGreaterThan(String value) {
            addCriterion("rec_phone >", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("rec_phone >=", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneLessThan(String value) {
            addCriterion("rec_phone <", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneLessThanOrEqualTo(String value) {
            addCriterion("rec_phone <=", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneLike(String value) {
            addCriterion("rec_phone like", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneNotLike(String value) {
            addCriterion("rec_phone not like", value, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneIn(List<String> values) {
            addCriterion("rec_phone in", values, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneNotIn(List<String> values) {
            addCriterion("rec_phone not in", values, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneBetween(String value1, String value2) {
            addCriterion("rec_phone between", value1, value2, "recPhone");
            return (Criteria) this;
        }

        public Criteria andRecPhoneNotBetween(String value1, String value2) {
            addCriterion("rec_phone not between", value1, value2, "recPhone");
            return (Criteria) this;
        }

        public Criteria andUserhomeLikeInsensitive(String value) {
            addCriterion("upper(userhome) like", value.toUpperCase(), "userhome");
            return (Criteria) this;
        }

        public Criteria andRecNameLikeInsensitive(String value) {
            addCriterion("upper(rec_name) like", value.toUpperCase(), "recName");
            return (Criteria) this;
        }

        public Criteria andRecPhoneLikeInsensitive(String value) {
            addCriterion("upper(rec_phone) like", value.toUpperCase(), "recPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}