package com.example.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
/**
 * 连接es
 * @author Administrator
 *
 */
public class ESManager {

	public static final String CLUSTER_NAME = "elasticsearch"; // 实例名称
	private static final String IP = "localhost";
	private static final int PORT = 9200; // 端口
	private static TransportClient client;

	private static Settings settings = Settings.settingsBuilder()
			.put("cluster.name", CLUSTER_NAME)
			.put("client.transport.sniff", true).build();

	static {
		try {
			client = TransportClient
					.builder()
					.settings(settings)
					.build()
					.addTransportAddress(
							new InetSocketTransportAddress(InetAddress
									.getByName(IP), PORT));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static synchronized TransportClient getTransportClient() {
		return client;
	}
}
