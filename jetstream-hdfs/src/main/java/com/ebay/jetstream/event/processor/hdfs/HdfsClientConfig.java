/*******************************************************************************
 *  Copyright © 2012-2015 eBay Software Foundation
 *  This program is dual licensed under the MIT and Apache 2.0 licenses.
 *  Please see LICENSE for more information.
 *******************************************************************************/
package com.ebay.jetstream.event.processor.hdfs;

import java.util.Properties;

import com.ebay.jetstream.config.AbstractNamedBean;
import com.ebay.jetstream.xmlser.XSerializable;

/**
 * @author weifang
 * 
 */
public class HdfsClientConfig extends AbstractNamedBean implements
		XSerializable {
	private String hdfsUrl;
	private String user;
	private Properties hadoopProperties;

	public String getHdfsUrl() {
		return hdfsUrl;
	}

	public void setHdfsUrl(String hdfsUrl) {
		this.hdfsUrl = hdfsUrl;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Properties getHadoopProperties() {
		return hadoopProperties;
	}

	public void setHadoopProperties(Properties hadoopProperties) {
		this.hadoopProperties = hadoopProperties;
	}

}
