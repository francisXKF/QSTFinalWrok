package com.qst.francis.pojo;

import java.sql.Date;
import java.sql.Timestamp;
//util.date 与 sql.date可以转换
public class Info {
	private int info_id;
	private int info_type_id;
	private String info_title;
	private int info_user_id;
	private String info_linkman;
	private String info_phone;
	private String info_email;
	private Timestamp info_date;
	private int info_check_state;
	private int info_pay_state;
	private int info_state;
	private String info_content;
	private String info_type_name;
	
	public int getInfo_id() {
		return info_id;
	}
	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}
	public int getInfo_type_id() {
		return info_type_id;
	}
	public void setInfo_type_id(int info_type_id) {
		this.info_type_id = info_type_id;
	}
	public String getInfo_title() {
		return info_title;
	}
	public void setInfo_title(String info_title) {
		this.info_title = info_title;
	}
	public int getInfo_user_id() {
		return info_user_id;
	}
	public void setInfo_user_id(int info_user_id) {
		this.info_user_id = info_user_id;
	}
	public String getInfo_phone() {
		return info_phone;
	}
	public void setInfo_phone(String info_phone) {
		this.info_phone = info_phone;
	}
	public String getInfo_email() {
		return info_email;
	}
	public void setInfo_email(String info_email) {
		this.info_email = info_email;
	}
	public Timestamp getInfo_date() {
		return info_date;
	}
	public void setInfo_date(Timestamp info_date) {
		this.info_date = info_date;
	}
	public int getInfo_check_state() {
		return info_check_state;
	}
	public void setInfo_check_state(int info_check_state) {
		this.info_check_state = info_check_state;
	}
	public int getInfo_pay_state() {
		return info_pay_state;
	}
	public void setInfo_pay_state(int info_pay_state) {
		this.info_pay_state = info_pay_state;
	}
	public int getInfo_state() {
		return info_state;
	}
	public void setInfo_state(int info_state) {
		this.info_state = info_state;
	}
	public String getInfo_content() {
		return info_content;
	}
	public void setInfo_content(String info_content) {
		this.info_content = info_content;
	}
	public String getInfo_linkman() {
		return info_linkman;
	}
	public void setInfo_linkman(String info_linkman) {
		this.info_linkman = info_linkman;
	}
	public String getInfo_type_name() {
		return info_type_name;
	}
	public void setInfo_type_name(String info_type_name) {
		this.info_type_name = info_type_name;
	}
}
