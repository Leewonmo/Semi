package DB;

import java.sql.Timestamp;

public class Message {
	String p_id;
	String co_id;
	String m_title;
	String m_context;
	Timestamp m_reg_date;
	
	
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getCo_id() {
		return co_id;
	}
	public void setCo_id(String co_id) {
		this.co_id = co_id;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_context() {
		return m_context;
	}
	public void setM_context(String m_context) {
		this.m_context = m_context;
	}
	public Timestamp getM_reg_date() {
		return m_reg_date;
	}
	public void setM_reg_date(Timestamp m_reg_date) {
		this.m_reg_date = m_reg_date;
	}
	
	
}
