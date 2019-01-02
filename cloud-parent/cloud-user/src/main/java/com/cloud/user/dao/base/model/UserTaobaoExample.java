package com.cloud.user.dao.base.model;

import java.util.ArrayList;
import java.util.List;

public class UserTaobaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTaobaoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreditLvIsNull() {
            addCriterion("credit_lv is null");
            return (Criteria) this;
        }

        public Criteria andCreditLvIsNotNull() {
            addCriterion("credit_lv is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLvEqualTo(Integer value) {
            addCriterion("credit_lv =", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvNotEqualTo(Integer value) {
            addCriterion("credit_lv <>", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvGreaterThan(Integer value) {
            addCriterion("credit_lv >", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_lv >=", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvLessThan(Integer value) {
            addCriterion("credit_lv <", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvLessThanOrEqualTo(Integer value) {
            addCriterion("credit_lv <=", value, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvIn(List<Integer> values) {
            addCriterion("credit_lv in", values, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvNotIn(List<Integer> values) {
            addCriterion("credit_lv not in", values, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvBetween(Integer value1, Integer value2) {
            addCriterion("credit_lv between", value1, value2, "creditLv");
            return (Criteria) this;
        }

        public Criteria andCreditLvNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_lv not between", value1, value2, "creditLv");
            return (Criteria) this;
        }

        public Criteria andTbAccountIsNull() {
            addCriterion("tb_account is null");
            return (Criteria) this;
        }

        public Criteria andTbAccountIsNotNull() {
            addCriterion("tb_account is not null");
            return (Criteria) this;
        }

        public Criteria andTbAccountEqualTo(String value) {
            addCriterion("tb_account =", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountNotEqualTo(String value) {
            addCriterion("tb_account <>", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountGreaterThan(String value) {
            addCriterion("tb_account >", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountGreaterThanOrEqualTo(String value) {
            addCriterion("tb_account >=", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountLessThan(String value) {
            addCriterion("tb_account <", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountLessThanOrEqualTo(String value) {
            addCriterion("tb_account <=", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountLike(String value) {
            addCriterion("tb_account like", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountNotLike(String value) {
            addCriterion("tb_account not like", value, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountIn(List<String> values) {
            addCriterion("tb_account in", values, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountNotIn(List<String> values) {
            addCriterion("tb_account not in", values, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountBetween(String value1, String value2) {
            addCriterion("tb_account between", value1, value2, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbAccountNotBetween(String value1, String value2) {
            addCriterion("tb_account not between", value1, value2, "tbAccount");
            return (Criteria) this;
        }

        public Criteria andTbPopularityIsNull() {
            addCriterion("tb_popularity is null");
            return (Criteria) this;
        }

        public Criteria andTbPopularityIsNotNull() {
            addCriterion("tb_popularity is not null");
            return (Criteria) this;
        }

        public Criteria andTbPopularityEqualTo(Integer value) {
            addCriterion("tb_popularity =", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityNotEqualTo(Integer value) {
            addCriterion("tb_popularity <>", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityGreaterThan(Integer value) {
            addCriterion("tb_popularity >", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_popularity >=", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityLessThan(Integer value) {
            addCriterion("tb_popularity <", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityLessThanOrEqualTo(Integer value) {
            addCriterion("tb_popularity <=", value, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityIn(List<Integer> values) {
            addCriterion("tb_popularity in", values, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityNotIn(List<Integer> values) {
            addCriterion("tb_popularity not in", values, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityBetween(Integer value1, Integer value2) {
            addCriterion("tb_popularity between", value1, value2, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andTbPopularityNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_popularity not between", value1, value2, "tbPopularity");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIsNull() {
            addCriterion("delivery_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIsNotNull() {
            addCriterion("delivery_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneEqualTo(String value) {
            addCriterion("delivery_phone =", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotEqualTo(String value) {
            addCriterion("delivery_phone <>", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneGreaterThan(String value) {
            addCriterion("delivery_phone >", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_phone >=", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLessThan(String value) {
            addCriterion("delivery_phone <", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLessThanOrEqualTo(String value) {
            addCriterion("delivery_phone <=", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneLike(String value) {
            addCriterion("delivery_phone like", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotLike(String value) {
            addCriterion("delivery_phone not like", value, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneIn(List<String> values) {
            addCriterion("delivery_phone in", values, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotIn(List<String> values) {
            addCriterion("delivery_phone not in", values, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneBetween(String value1, String value2) {
            addCriterion("delivery_phone between", value1, value2, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryPhoneNotBetween(String value1, String value2) {
            addCriterion("delivery_phone not between", value1, value2, "deliveryPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIsNull() {
            addCriterion("delivery_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIsNotNull() {
            addCriterion("delivery_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameEqualTo(String value) {
            addCriterion("delivery_name =", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotEqualTo(String value) {
            addCriterion("delivery_name <>", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameGreaterThan(String value) {
            addCriterion("delivery_name >", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_name >=", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLessThan(String value) {
            addCriterion("delivery_name <", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_name <=", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameLike(String value) {
            addCriterion("delivery_name like", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotLike(String value) {
            addCriterion("delivery_name not like", value, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameIn(List<String> values) {
            addCriterion("delivery_name in", values, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotIn(List<String> values) {
            addCriterion("delivery_name not in", values, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameBetween(String value1, String value2) {
            addCriterion("delivery_name between", value1, value2, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andDeliveryNameNotBetween(String value1, String value2) {
            addCriterion("delivery_name not between", value1, value2, "deliveryName");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistricIsNull() {
            addCriterion("distric is null");
            return (Criteria) this;
        }

        public Criteria andDistricIsNotNull() {
            addCriterion("distric is not null");
            return (Criteria) this;
        }

        public Criteria andDistricEqualTo(String value) {
            addCriterion("distric =", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricNotEqualTo(String value) {
            addCriterion("distric <>", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricGreaterThan(String value) {
            addCriterion("distric >", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricGreaterThanOrEqualTo(String value) {
            addCriterion("distric >=", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricLessThan(String value) {
            addCriterion("distric <", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricLessThanOrEqualTo(String value) {
            addCriterion("distric <=", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricLike(String value) {
            addCriterion("distric like", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricNotLike(String value) {
            addCriterion("distric not like", value, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricIn(List<String> values) {
            addCriterion("distric in", values, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricNotIn(List<String> values) {
            addCriterion("distric not in", values, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricBetween(String value1, String value2) {
            addCriterion("distric between", value1, value2, "distric");
            return (Criteria) this;
        }

        public Criteria andDistricNotBetween(String value1, String value2) {
            addCriterion("distric not between", value1, value2, "distric");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andOrderTailIsNull() {
            addCriterion("order_tail is null");
            return (Criteria) this;
        }

        public Criteria andOrderTailIsNotNull() {
            addCriterion("order_tail is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTailEqualTo(String value) {
            addCriterion("order_tail =", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailNotEqualTo(String value) {
            addCriterion("order_tail <>", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailGreaterThan(String value) {
            addCriterion("order_tail >", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailGreaterThanOrEqualTo(String value) {
            addCriterion("order_tail >=", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailLessThan(String value) {
            addCriterion("order_tail <", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailLessThanOrEqualTo(String value) {
            addCriterion("order_tail <=", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailLike(String value) {
            addCriterion("order_tail like", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailNotLike(String value) {
            addCriterion("order_tail not like", value, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailIn(List<String> values) {
            addCriterion("order_tail in", values, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailNotIn(List<String> values) {
            addCriterion("order_tail not in", values, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailBetween(String value1, String value2) {
            addCriterion("order_tail between", value1, value2, "orderTail");
            return (Criteria) this;
        }

        public Criteria andOrderTailNotBetween(String value1, String value2) {
            addCriterion("order_tail not between", value1, value2, "orderTail");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMyTbImgIsNull() {
            addCriterion("my_tb_img is null");
            return (Criteria) this;
        }

        public Criteria andMyTbImgIsNotNull() {
            addCriterion("my_tb_img is not null");
            return (Criteria) this;
        }

        public Criteria andMyTbImgEqualTo(String value) {
            addCriterion("my_tb_img =", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgNotEqualTo(String value) {
            addCriterion("my_tb_img <>", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgGreaterThan(String value) {
            addCriterion("my_tb_img >", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgGreaterThanOrEqualTo(String value) {
            addCriterion("my_tb_img >=", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgLessThan(String value) {
            addCriterion("my_tb_img <", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgLessThanOrEqualTo(String value) {
            addCriterion("my_tb_img <=", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgLike(String value) {
            addCriterion("my_tb_img like", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgNotLike(String value) {
            addCriterion("my_tb_img not like", value, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgIn(List<String> values) {
            addCriterion("my_tb_img in", values, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgNotIn(List<String> values) {
            addCriterion("my_tb_img not in", values, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgBetween(String value1, String value2) {
            addCriterion("my_tb_img between", value1, value2, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andMyTbImgNotBetween(String value1, String value2) {
            addCriterion("my_tb_img not between", value1, value2, "myTbImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgIsNull() {
            addCriterion("eval_img is null");
            return (Criteria) this;
        }

        public Criteria andEvalImgIsNotNull() {
            addCriterion("eval_img is not null");
            return (Criteria) this;
        }

        public Criteria andEvalImgEqualTo(String value) {
            addCriterion("eval_img =", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgNotEqualTo(String value) {
            addCriterion("eval_img <>", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgGreaterThan(String value) {
            addCriterion("eval_img >", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgGreaterThanOrEqualTo(String value) {
            addCriterion("eval_img >=", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgLessThan(String value) {
            addCriterion("eval_img <", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgLessThanOrEqualTo(String value) {
            addCriterion("eval_img <=", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgLike(String value) {
            addCriterion("eval_img like", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgNotLike(String value) {
            addCriterion("eval_img not like", value, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgIn(List<String> values) {
            addCriterion("eval_img in", values, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgNotIn(List<String> values) {
            addCriterion("eval_img not in", values, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgBetween(String value1, String value2) {
            addCriterion("eval_img between", value1, value2, "evalImg");
            return (Criteria) this;
        }

        public Criteria andEvalImgNotBetween(String value1, String value2) {
            addCriterion("eval_img not between", value1, value2, "evalImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgIsNull() {
            addCriterion("alipay_auth_img is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgIsNotNull() {
            addCriterion("alipay_auth_img is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgEqualTo(String value) {
            addCriterion("alipay_auth_img =", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgNotEqualTo(String value) {
            addCriterion("alipay_auth_img <>", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgGreaterThan(String value) {
            addCriterion("alipay_auth_img >", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_auth_img >=", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgLessThan(String value) {
            addCriterion("alipay_auth_img <", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgLessThanOrEqualTo(String value) {
            addCriterion("alipay_auth_img <=", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgLike(String value) {
            addCriterion("alipay_auth_img like", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgNotLike(String value) {
            addCriterion("alipay_auth_img not like", value, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgIn(List<String> values) {
            addCriterion("alipay_auth_img in", values, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgNotIn(List<String> values) {
            addCriterion("alipay_auth_img not in", values, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgBetween(String value1, String value2) {
            addCriterion("alipay_auth_img between", value1, value2, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andAlipayAuthImgNotBetween(String value1, String value2) {
            addCriterion("alipay_auth_img not between", value1, value2, "alipayAuthImg");
            return (Criteria) this;
        }

        public Criteria andShoppingTagIsNull() {
            addCriterion("shopping_tag is null");
            return (Criteria) this;
        }

        public Criteria andShoppingTagIsNotNull() {
            addCriterion("shopping_tag is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingTagEqualTo(String value) {
            addCriterion("shopping_tag =", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagNotEqualTo(String value) {
            addCriterion("shopping_tag <>", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagGreaterThan(String value) {
            addCriterion("shopping_tag >", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_tag >=", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagLessThan(String value) {
            addCriterion("shopping_tag <", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagLessThanOrEqualTo(String value) {
            addCriterion("shopping_tag <=", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagLike(String value) {
            addCriterion("shopping_tag like", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagNotLike(String value) {
            addCriterion("shopping_tag not like", value, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagIn(List<String> values) {
            addCriterion("shopping_tag in", values, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagNotIn(List<String> values) {
            addCriterion("shopping_tag not in", values, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagBetween(String value1, String value2) {
            addCriterion("shopping_tag between", value1, value2, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andShoppingTagNotBetween(String value1, String value2) {
            addCriterion("shopping_tag not between", value1, value2, "shoppingTag");
            return (Criteria) this;
        }

        public Criteria andHbImgIsNull() {
            addCriterion("hb_img is null");
            return (Criteria) this;
        }

        public Criteria andHbImgIsNotNull() {
            addCriterion("hb_img is not null");
            return (Criteria) this;
        }

        public Criteria andHbImgEqualTo(String value) {
            addCriterion("hb_img =", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgNotEqualTo(String value) {
            addCriterion("hb_img <>", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgGreaterThan(String value) {
            addCriterion("hb_img >", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgGreaterThanOrEqualTo(String value) {
            addCriterion("hb_img >=", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgLessThan(String value) {
            addCriterion("hb_img <", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgLessThanOrEqualTo(String value) {
            addCriterion("hb_img <=", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgLike(String value) {
            addCriterion("hb_img like", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgNotLike(String value) {
            addCriterion("hb_img not like", value, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgIn(List<String> values) {
            addCriterion("hb_img in", values, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgNotIn(List<String> values) {
            addCriterion("hb_img not in", values, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgBetween(String value1, String value2) {
            addCriterion("hb_img between", value1, value2, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbImgNotBetween(String value1, String value2) {
            addCriterion("hb_img not between", value1, value2, "hbImg");
            return (Criteria) this;
        }

        public Criteria andHbStatusIsNull() {
            addCriterion("hb_status is null");
            return (Criteria) this;
        }

        public Criteria andHbStatusIsNotNull() {
            addCriterion("hb_status is not null");
            return (Criteria) this;
        }

        public Criteria andHbStatusEqualTo(Integer value) {
            addCriterion("hb_status =", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusNotEqualTo(Integer value) {
            addCriterion("hb_status <>", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusGreaterThan(Integer value) {
            addCriterion("hb_status >", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hb_status >=", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusLessThan(Integer value) {
            addCriterion("hb_status <", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hb_status <=", value, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusIn(List<Integer> values) {
            addCriterion("hb_status in", values, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusNotIn(List<Integer> values) {
            addCriterion("hb_status not in", values, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusBetween(Integer value1, Integer value2) {
            addCriterion("hb_status between", value1, value2, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andHbStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hb_status not between", value1, value2, "hbStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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