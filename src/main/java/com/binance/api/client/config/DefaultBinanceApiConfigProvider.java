package com.binance.api.client.config;

public class DefaultBinanceApiConfigProvider implements BinanceApiConfigProvider {
	
	/**
	 * Base domain for URLs.
	 */
	private static final String BASE_DOMAIN = "binance.com";

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
		return String.format("https://api.%s", getBaseDomain());
	}

	/**
	 * Streaming API base URL.
	 */
	public String getStreamApiBaseUrl() {
		return String.format("wss://stream.%s:9443/ws", getBaseDomain());
	}

	/**
	 * Asset info base URL.
	 */
	public String getAssetInfoApiBaseUrl() {
		return String.format("https://%s/", getBaseDomain());
	}
}
