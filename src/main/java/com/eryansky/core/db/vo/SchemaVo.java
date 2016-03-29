/**
 * Copyright (c) 2012-2014 http://www.eryansky.com
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.eryansky.core.db.vo;

import java.io.Serializable;

/**
 * 模式 VO
 * User: 尔演&Eryan eryanwcp@gmail.com
 * Date: 13-12-27 下午5:21
 */
public class SchemaVo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 模式中文名
     */
    private String name;
    /**
     * 模式
     */
    private String code;

    public SchemaVo() {
    }

    public SchemaVo(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
