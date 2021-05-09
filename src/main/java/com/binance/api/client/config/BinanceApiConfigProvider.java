package com.binance.api.client.config;

public interface BinanceApiConfigProvider {
	
	/**
	 * REST API base URL.
	 */
	public String getApiBaseUrl();

	/**
	 * Streaming API base URL.
	 */
	public String getStreamApiBaseUrl();

	/**
	 * Asset info base URL.
	 */
	public String getAssetInfoApiBaseUrl();
}
