package com.binance.api.client.config;

public class SpotTestNetworkBinanceApiConfigProvider implements BinanceApiConfigProvider {
	
	/**
	 * Base domain for URLs.
	 */
	private static final String BASE_DOMAIN = "testnet.binance.vision";

	/**
	 * Get the URL base domain name (e.g., binance.com).
	 *
	 * @return The base domain for URLs
	 */
	public String getBaseDomain() {
		return BASE_DOMAIN;
	}

	/**
	 * REST API base URL.
	 */
	public String getApiBaseUrl() {
		return String.format("https://%s", getBaseDomain());
	}

	/**
	 * Streaming API base URL.
	 */
	public String getStreamApiBaseUrl() {
		return String.format("wss://%s/ws", getBaseDomain());
	}

	/**
	 * Asset info base URL.
	 */
	public String getAssetInfoApiBaseUrl() {
		return String.format("https://%s/", getBaseDomain());
	}
}
