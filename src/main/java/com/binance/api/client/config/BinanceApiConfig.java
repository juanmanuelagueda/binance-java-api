package com.binance.api.client.config;

/**
 * Configuration used for Binance operations.
 */
public class BinanceApiConfig {
	
	private BinanceApiConfig() {}
	
	private static BinanceApiConfigProvider impl = new DefaultBinanceApiConfigProvider();

	/**
	 * REST API base URL.
	 */
	public static String getApiBaseUrl() {
		return impl.getApiBaseUrl();
	}

	/**
	 * Streaming API base URL.
	 */
	public static String getStreamApiBaseUrl() {
		return impl.getStreamApiBaseUrl();
	}

	/**
	 * Asset info base URL.
	 */
	public static String getAssetInfoApiBaseUrl() {
		return impl.getStreamApiBaseUrl();
	}
	
	public static void setBinanceApiConfig(BinanceApiConfigProvider config) {
		impl = config;
	}
	
	public static void useSpotTestNetwork() {
		impl = new SpotTestNetworkBinanceApiConfigProvider();
	}
}
