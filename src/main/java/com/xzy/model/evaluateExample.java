package com.xzy.model;

import java.util.ArrayList;
import java.util.List;

public class evaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public evaluateExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("com_ID is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_ID =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_ID <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_ID >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_ID >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_ID <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_ID <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_ID in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_ID not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_ID between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_ID not between", value1, value2, "comId");
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andDialogboxIsNull() {
            addCriterion("dialogbox is null");
            return (Criteria) this;
        }

        public Criteria andDialogboxIsNotNull() {
            addCriterion("dialogbox is not null");
            return (Criteria) this;
        }

        public Criteria andDialogboxEqualTo(String value) {
            addCriterion("dialogbox =", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxNotEqualTo(String value) {
            addCriterion("dialogbox <>", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxGreaterThan(String value) {
            addCriterion("dialogbox >", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxGreaterThanOrEqualTo(String value) {
            addCriterion("dialogbox >=", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxLessThan(String value) {
            addCriterion("dialogbox <", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxLessThanOrEqualTo(String value) {
            addCriterion("dialogbox <=", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxLike(String value) {
            addCriterion("dialogbox like", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxNotLike(String value) {
            addCriterion("dialogbox not like", value, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxIn(List<String> values) {
            addCriterion("dialogbox in", values, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxNotIn(List<String> values) {
            addCriterion("dialogbox not in", values, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxBetween(String value1, String value2) {
            addCriterion("dialogbox between", value1, value2, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andDialogboxNotBetween(String value1, String value2) {
            addCriterion("dialogbox not between", value1, value2, "dialogbox");
            return (Criteria) this;
        }

        public Criteria andComNumIsNull() {
            addCriterion("com_num is null");
            return (Criteria) this;
        }

        public Criteria andComNumIsNotNull() {
            addCriterion("com_num is not null");
            return (Criteria) this;
        }

        public Criteria andComNumEqualTo(Integer value) {
            addCriterion("com_num =", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotEqualTo(Integer value) {
            addCriterion("com_num <>", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumGreaterThan(Integer value) {
            addCriterion("com_num >", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_num >=", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumLessThan(Integer value) {
            addCriterion("com_num <", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumLessThanOrEqualTo(Integer value) {
            addCriterion("com_num <=", value, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumIn(List<Integer> values) {
            addCriterion("com_num in", values, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotIn(List<Integer> values) {
            addCriterion("com_num not in", values, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumBetween(Integer value1, Integer value2) {
            addCriterion("com_num between", value1, value2, "comNum");
            return (Criteria) this;
        }

        public Criteria andComNumNotBetween(Integer value1, Integer value2) {
            addCriterion("com_num not between", value1, value2, "comNum");
            return (Criteria) this;
        }

        public Criteria andDialogboxLikeInsensitive(String value) {
            addCriterion("upper(dialogbox) like", value.toUpperCase(), "dialogbox");
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