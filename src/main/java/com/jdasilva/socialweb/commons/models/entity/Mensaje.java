package com.jdasilva.socialweb.commons.models.entity;

import java.io.Serializable;
import java.util.List;

public class Mensaje implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<String> info;
	private List<String> warning;
	private List<String> danger;
	private List<String> success;
	
	public List<String> getInfo() {
		return info;
	}
	public void setInfo(List<String> info) {
		this.info = info;
	}
	public List<String> getWarning() {
		return warning;
	}
	public void setWarning(List<String> warning) {
		this.warning = warning;
	}
	public List<String> getDanger() {
		return danger;
	}
	public void setDanger(List<String> danger) {
		this.danger = danger;
	}
	public List<String> getSuccess() {
		return success;
	}
	public void setSuccess(List<String> success) {
		this.success = success;
	}

}
