package com.cloud.schedule.dao.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemUserExample() {
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

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Integer value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Integer value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Integer value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Integer value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Integer> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Integer> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresIsNull() {
            addCriterion("OWNED_STORES is null");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresIsNotNull() {
            addCriterion("OWNED_STORES is not null");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresEqualTo(Integer value) {
            addCriterion("OWNED_STORES =", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresNotEqualTo(Integer value) {
            addCriterion("OWNED_STORES <>", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresGreaterThan(Integer value) {
            addCriterion("OWNED_STORES >", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNED_STORES >=", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresLessThan(Integer value) {
            addCriterion("OWNED_STORES <", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresLessThanOrEqualTo(Integer value) {
            addCriterion("OWNED_STORES <=", value, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresIn(List<Integer> values) {
            addCriterion("OWNED_STORES in", values, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresNotIn(List<Integer> values) {
            addCriterion("OWNED_STORES not in", values, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresBetween(Integer value1, Integer value2) {
            addCriterion("OWNED_STORES between", value1, value2, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedStoresNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNED_STORES not between", value1, value2, "ownedStores");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamIsNull() {
            addCriterion("OWNED_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamIsNotNull() {
            addCriterion("OWNED_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamEqualTo(Integer value) {
            addCriterion("OWNED_TEAM =", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamNotEqualTo(Integer value) {
            addCriterion("OWNED_TEAM <>", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamGreaterThan(Integer value) {
            addCriterion("OWNED_TEAM >", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNED_TEAM >=", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamLessThan(Integer value) {
            addCriterion("OWNED_TEAM <", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamLessThanOrEqualTo(Integer value) {
            addCriterion("OWNED_TEAM <=", value, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamIn(List<Integer> values) {
            addCriterion("OWNED_TEAM in", values, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamNotIn(List<Integer> values) {
            addCriterion("OWNED_TEAM not in", values, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamBetween(Integer value1, Integer value2) {
            addCriterion("OWNED_TEAM between", value1, value2, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andOwnedTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNED_TEAM not between", value1, value2, "ownedTeam");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIsStarIsNull() {
            addCriterion("IS_STAR is null");
            return (Criteria) this;
        }

        public Criteria andIsStarIsNotNull() {
            addCriterion("IS_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andIsStarEqualTo(Integer value) {
            addCriterion("IS_STAR =", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotEqualTo(Integer value) {
            addCriterion("IS_STAR <>", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarGreaterThan(Integer value) {
            addCriterion("IS_STAR >", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_STAR >=", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarLessThan(Integer value) {
            addCriterion("IS_STAR <", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarLessThanOrEqualTo(Integer value) {
            addCriterion("IS_STAR <=", value, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarIn(List<Integer> values) {
            addCriterion("IS_STAR in", values, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotIn(List<Integer> values) {
            addCriterion("IS_STAR not in", values, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarBetween(Integer value1, Integer value2) {
            addCriterion("IS_STAR between", value1, value2, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsStarNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_STAR not between", value1, value2, "isStar");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeIsNull() {
            addCriterion("LAST_CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeIsNotNull() {
            addCriterion("LAST_CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeEqualTo(Date value) {
            addCriterion("LAST_CHANGE_TIME =", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeNotEqualTo(Date value) {
            addCriterion("LAST_CHANGE_TIME <>", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeGreaterThan(Date value) {
            addCriterion("LAST_CHANGE_TIME >", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_CHANGE_TIME >=", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeLessThan(Date value) {
            addCriterion("LAST_CHANGE_TIME <", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_CHANGE_TIME <=", value, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeIn(List<Date> values) {
            addCriterion("LAST_CHANGE_TIME in", values, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeNotIn(List<Date> values) {
            addCriterion("LAST_CHANGE_TIME not in", values, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_CHANGE_TIME between", value1, value2, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andLastChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_CHANGE_TIME not between", value1, value2, "lastChangeTime");
            return (Criteria) this;
        }

        public Criteria andCareteUserIsNull() {
            addCriterion("CARETE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCareteUserIsNotNull() {
            addCriterion("CARETE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCareteUserEqualTo(Integer value) {
            addCriterion("CARETE_USER =", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserNotEqualTo(Integer value) {
            addCriterion("CARETE_USER <>", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserGreaterThan(Integer value) {
            addCriterion("CARETE_USER >", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARETE_USER >=", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserLessThan(Integer value) {
            addCriterion("CARETE_USER <", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserLessThanOrEqualTo(Integer value) {
            addCriterion("CARETE_USER <=", value, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserIn(List<Integer> values) {
            addCriterion("CARETE_USER in", values, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserNotIn(List<Integer> values) {
            addCriterion("CARETE_USER not in", values, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserBetween(Integer value1, Integer value2) {
            addCriterion("CARETE_USER between", value1, value2, "careteUser");
            return (Criteria) this;
        }

        public Criteria andCareteUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CARETE_USER not between", value1, value2, "careteUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserIsNull() {
            addCriterion("LAST_CHANGE_USER is null");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserIsNotNull() {
            addCriterion("LAST_CHANGE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserEqualTo(Integer value) {
            addCriterion("LAST_CHANGE_USER =", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserNotEqualTo(Integer value) {
            addCriterion("LAST_CHANGE_USER <>", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserGreaterThan(Integer value) {
            addCriterion("LAST_CHANGE_USER >", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_CHANGE_USER >=", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserLessThan(Integer value) {
            addCriterion("LAST_CHANGE_USER <", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_CHANGE_USER <=", value, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserIn(List<Integer> values) {
            addCriterion("LAST_CHANGE_USER in", values, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserNotIn(List<Integer> values) {
            addCriterion("LAST_CHANGE_USER not in", values, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserBetween(Integer value1, Integer value2) {
            addCriterion("LAST_CHANGE_USER between", value1, value2, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andLastChangeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_CHANGE_USER not between", value1, value2, "lastChangeUser");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNull() {
            addCriterion("STOREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNotNull() {
            addCriterion("STOREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdEqualTo(Integer value) {
            addCriterion("STOREHOUSE_ID =", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotEqualTo(Integer value) {
            addCriterion("STOREHOUSE_ID <>", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThan(Integer value) {
            addCriterion("STOREHOUSE_ID >", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOREHOUSE_ID >=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThan(Integer value) {
            addCriterion("STOREHOUSE_ID <", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("STOREHOUSE_ID <=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIn(List<Integer> values) {
            addCriterion("STOREHOUSE_ID in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotIn(List<Integer> values) {
            addCriterion("STOREHOUSE_ID not in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("STOREHOUSE_ID between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STOREHOUSE_ID not between", value1, value2, "storehouseId");
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