package edu.spring.boardproject;

public class BDMemberVO {
		 int bm_no;
		 String bm_id;
		 String bm_pw;
		 String bm_name;
		 String bm_addr;
		 String bm_phone;
		 String bm_email;

		 
		public BDMemberVO() {}
		
		public BDMemberVO(int bm_no, String bm_id, String bm_pw, String bm_name, String bm_addr, String bm_phone,
				String bm_email) {
			super();
			this.bm_no = bm_no;
			this.bm_id = bm_id;
			this.bm_pw = bm_pw;
			this.bm_name = bm_name;
			this.bm_addr = bm_addr;
			this.bm_phone = bm_phone;
			this.bm_email = bm_email;

		}
		public int getBm_no() {
			return bm_no;
		}
		public void setBm_no(int bm_no) {
			this.bm_no = bm_no;
		}
		public String getBm_id() {
			return bm_id;
		}
		public void setBm_id(String bm_id) {
			this.bm_id = bm_id;
		}
		public String getBm_pw() {
			return bm_pw;
		}
		public void setBm_pw(String bm_pw) {
			this.bm_pw = bm_pw;
		}
		public String getBm_name() {
			return bm_name;
		}
		public void setBm_name(String bm_name) {
			this.bm_name = bm_name;
		}
		public String getBm_addr() {
			return bm_addr;
		}
		public void setBm_addr(String bm_addr) {
			this.bm_addr = bm_addr;
		}
		public String getBm_phone() {
			return bm_phone;
		}
		public void setBm_phone(String bm_phone) {
			this.bm_phone = bm_phone;
		}
		public String getBm_email() {
			return bm_email;
		}
		public void setBm_email(String bm_email) {
			this.bm_email = bm_email;
		}
		
	
	
}
