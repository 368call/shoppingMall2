package com.xzy.model;

import java.util.ArrayList;
import java.util.List;

public class goods_detailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public goods_detailsExample() {
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

        public Criteria andDetailsIdIsNull() {
            addCriterion("details_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIsNotNull() {
            addCriterion("details_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdEqualTo(Integer value) {
            addCriterion("details_ID =", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotEqualTo(Integer value) {
            addCriterion("details_ID <>", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThan(Integer value) {
            addCriterion("details_ID >", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_ID >=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThan(Integer value) {
            addCriterion("details_ID <", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("details_ID <=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIn(List<Integer> values) {
            addCriterion("details_ID in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotIn(List<Integer> values) {
            addCriterion("details_ID not in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("details_ID between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("details_ID not between", value1, value2, "detailsId");
            return (Criteria) this;
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

        public Criteria andColIdIsNull() {
            addCriterion("col_ID is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("col_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(Integer value) {
            addCriterion("col_ID =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(Integer value) {
            addCriterion("col_ID <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(Integer value) {
            addCriterion("col_ID >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_ID >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(Integer value) {
            addCriterion("col_ID <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(Integer value) {
            addCriterion("col_ID <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<Integer> values) {
            addCriterion("col_ID in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<Integer> values) {
            addCriterion("col_ID not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(Integer value1, Integer value2) {
            addCriterion("col_ID between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("col_ID not between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andSGidIsNull() {
            addCriterion("s_gID is null");
            return (Criteria) this;
        }

        public Criteria andSGidIsNotNull() {
            addCriterion("s_gID is not null");
            return (Criteria) this;
        }

        public Criteria andSGidEqualTo(Integer value) {
            addCriterion("s_gID =", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidNotEqualTo(Integer value) {
            addCriterion("s_gID <>", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidGreaterThan(Integer value) {
            addCriterion("s_gID >", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_gID >=", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidLessThan(Integer value) {
            addCriterion("s_gID <", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidLessThanOrEqualTo(Integer value) {
            addCriterion("s_gID <=", value, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidIn(List<Integer> values) {
            addCriterion("s_gID in", values, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidNotIn(List<Integer> values) {
            addCriterion("s_gID not in", values, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidBetween(Integer value1, Integer value2) {
            addCriterion("s_gID between", value1, value2, "sGid");
            return (Criteria) this;
        }

        public Criteria andSGidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_gID not between", value1, value2, "sGid");
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