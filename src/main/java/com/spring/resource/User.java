package com.spring.resource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int	CARD_GROUP_SET_ID;
    String	card_group_set_name;
    String	network_code;
    String created_on;
    String	created_by;
    String modified_on;
    String	modified_by;
    String	last_version;
    String	module_code;
    String status;
    String	language_1_message;
    String	language_2_message;
    String	sub_service;
    String	service_type;
    String	set_type;

    String	is_default;
    
    
    
    

	public int getCARD_GROUP_SET_ID() {
		return CARD_GROUP_SET_ID;
	}

	public void setCARD_GROUP_SET_ID(int cARD_GROUP_SET_ID) {
		CARD_GROUP_SET_ID = cARD_GROUP_SET_ID;
	}

	public String getCard_group_set_name() {
		return card_group_set_name;
	}

	public void setCard_group_set_name(String card_group_set_name) {
		this.card_group_set_name = card_group_set_name;
	}

	public String getNetwork_code() {
		return network_code;
	}

	public void setNetwork_code(String network_code) {
		this.network_code = network_code;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_on() {
		return modified_on;
	}

	public void setModified_on(String modified_on) {
		this.modified_on = modified_on;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public String getLast_version() {
		return last_version;
	}

	public void setLast_version(String last_version) {
		this.last_version = last_version;
	}

	public String getModule_code() {
		return module_code;
	}

	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLanguage_1_message() {
		return language_1_message;
	}

	public void setLanguage_1_message(String language_1_message) {
		this.language_1_message = language_1_message;
	}

	public String getLanguage_2_message() {
		return language_2_message;
	}

	public void setLanguage_2_message(String language_2_message) {
		this.language_2_message = language_2_message;
	}

	public String getSub_service() {
		return sub_service;
	}

	public void setSub_service(String sub_service) {
		this.sub_service = sub_service;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getSet_type() {
		return set_type;
	}

	public void setSet_type(String set_type) {
		this.set_type = set_type;
	}

	public String getIs_default() {
		return is_default;
	}

	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}
    
    


}