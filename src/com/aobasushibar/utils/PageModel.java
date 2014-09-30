package com.aobasushibar.utils;


import java.util.List;

public class PageModel<T> {
	
	
	private List<T> list;
	

	private int totalRecords;
	
	
	private int pageSize;
	
	
	private int pageNo;

	
	public int getTotalPages() {
		return (totalRecords + pageSize - 1) / pageSize;
	}
	
	public int getTopPageNo() {
		return 1;
	}
	
	
	public int getPreviousPageNo() {
		if (this.pageNo <= 1) {
			return 1;
		}
		return this.pageNo - 1;
	}
	
	public int getNextPageNo() {
		if (this.pageNo >= getButtomPageNo()) {
			return getButtomPageNo();
		}
		return this.pageNo + 1;
	}
	
	
	public int getButtomPageNo() {
		return getTotalPages();
	}
	
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
