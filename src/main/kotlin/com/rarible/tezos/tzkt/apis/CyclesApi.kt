/**
 * TzKT API
 *
 * # Introduction  TzKT Explorer provides free REST API and WebSocket API for accessing detailed Tezos blockchain data and helps developers build more services and applications on top of Tezos. TzKT is an open-source project, so you can easily clone and build it and use it as a self-hosted service to avoid any risks of depending on third-party services.  TzKT API is available for the following Tezos networks with the following base URLs:  - Mainnet: `https://api.tzkt.io/` or `https://api.mainnet.tzkt.io/` ([view docs](https://api.tzkt.io))  - Granadanet: `https://api.granadanet.tzkt.io/` ([view docs](https://api.granadanet.tzkt.io))     - Hangzhou2net: `https://api.hangzhou2net.tzkt.io/` ([view docs](https://api.hangzhou2net.tzkt.io))  We also provide a staging environment for testing newest features and pre-updating client applications before deploying to production:  - Mainnet staging: `https://staging.api.tzkt.io/` or `https://staging.api.mainnet.tzkt.io/` ([view docs](https://staging.api.tzkt.io))  Feel free to contact us if you have any questions or feature requests. Your feedback really helps us make TzKT better!  - Discord: https://discord.gg/aG8XKuwsQd - Telegram: https://t.me/baking_bad_chat - Slack: https://tezos-dev.slack.com/archives/CV5NX7F2L - Twitter: https://twitter.com/TezosBakingBad - Email: hello@baking-bad.org  And don't forget to star TzKT project [on GitHub](https://github.com/baking-bad/tzkt) ;)  # Terms of Use  TzKT API is free for everyone and for both commercial and non-commercial usage.  If your application or service uses the TzKT API in any forms: directly on frontend or indirectly on backend, you should mention that fact on your website or application by placing the label **\"Powered by TzKT API\"** with a direct link to [tzkt.io](https://tzkt.io).   # Rate Limits  There will be no rate limits as long as our servers can handle the load without additional infrastructure costs. However, any apparent abuse will be prevented by setting targeted rate limits.  Check out [Tezos Explorer API Best Practices](https://baking-bad.org/blog/tag/TzKT/) and in particular [how to optimize requests count](https://baking-bad.org/blog/2020/07/29/tezos-explorer-api-tzkt-how-often-to-make-requests/).  --- 
 *
 * The version of the OpenAPI document: v1.7.0
 * Contact: hello@baking-bad.org
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.rarible.tezos.tzkt.apis

import java.io.IOException

import com.rarible.tezos.tzkt.models.Cycle
import com.rarible.tezos.tzkt.models.OneOfLessThanInt32ParameterGreaterThan
import com.rarible.tezos.tzkt.models.OneOfLessThanOffsetParameterGreaterThan
import com.rarible.tezos.tzkt.models.OneOfLessThanSelectParameterGreaterThan
import com.rarible.tezos.tzkt.models.OneOfLessThanSortParameterGreaterThan
import com.rarible.tezos.tzkt.models.OneOfLessThanSymbolsGreaterThan

import com.squareup.moshi.Json

import com.rarible.tezos.tzkt.infrastructure.ApiClient
import com.rarible.tezos.tzkt.infrastructure.ApiResponse
import com.rarible.tezos.tzkt.infrastructure.ClientException
import com.rarible.tezos.tzkt.infrastructure.ClientError
import com.rarible.tezos.tzkt.infrastructure.ServerException
import com.rarible.tezos.tzkt.infrastructure.ServerError
import com.rarible.tezos.tzkt.infrastructure.MultiValueMap
import com.rarible.tezos.tzkt.infrastructure.RequestConfig
import com.rarible.tezos.tzkt.infrastructure.RequestMethod
import com.rarible.tezos.tzkt.infrastructure.ResponseType
import com.rarible.tezos.tzkt.infrastructure.Success
import com.rarible.tezos.tzkt.infrastructure.toMultiValue

class CyclesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://staging.api.tzkt.io")
        }
    }

    /**
    * Get cycles
    * Returns a list of cycles, including future cycles.
    * @param snapshotIndex Filters cycles by snapshot index (0..15) (optional)
    * @param select Specify comma-separated list of fields to include into response or leave it undefined to return full object. If you select single field, response will be an array of values in both &#x60;.fields&#x60; and &#x60;.values&#x60; modes. (optional)
    * @param sort Sorts cycles by specified field. Supported fields: &#x60;index&#x60; (default, desc). (optional)
    * @param offset Specifies which or how many items should be skipped (optional)
    * @param limit Maximum number of items to return (optional, default to 100)
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return kotlin.collections.List<Cycle>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cyclesGet(snapshotIndex: OneOfLessThanInt32ParameterGreaterThan?, select: OneOfLessThanSelectParameterGreaterThan?, sort: OneOfLessThanSortParameterGreaterThan?, offset: OneOfLessThanOffsetParameterGreaterThan?, limit: kotlin.Int?, quote: OneOfLessThanSymbolsGreaterThan?) : kotlin.collections.List<Cycle> {
        val localVarResponse = cyclesGetWithHttpInfo(snapshotIndex = snapshotIndex, select = select, sort = sort, offset = offset, limit = limit, quote = quote)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Cycle>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get cycles
    * Returns a list of cycles, including future cycles.
    * @param snapshotIndex Filters cycles by snapshot index (0..15) (optional)
    * @param select Specify comma-separated list of fields to include into response or leave it undefined to return full object. If you select single field, response will be an array of values in both &#x60;.fields&#x60; and &#x60;.values&#x60; modes. (optional)
    * @param sort Sorts cycles by specified field. Supported fields: &#x60;index&#x60; (default, desc). (optional)
    * @param offset Specifies which or how many items should be skipped (optional)
    * @param limit Maximum number of items to return (optional, default to 100)
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return ApiResponse<kotlin.collections.List<Cycle>?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun cyclesGetWithHttpInfo(snapshotIndex: OneOfLessThanInt32ParameterGreaterThan?, select: OneOfLessThanSelectParameterGreaterThan?, sort: OneOfLessThanSortParameterGreaterThan?, offset: OneOfLessThanOffsetParameterGreaterThan?, limit: kotlin.Int?, quote: OneOfLessThanSymbolsGreaterThan?) : ApiResponse<kotlin.collections.List<Cycle>?> {
        val localVariableConfig = cyclesGetRequestConfig(snapshotIndex = snapshotIndex, select = select, sort = sort, offset = offset, limit = limit, quote = quote)

        return request<Unit, kotlin.collections.List<Cycle>>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation cyclesGet
    *
    * @param snapshotIndex Filters cycles by snapshot index (0..15) (optional)
    * @param select Specify comma-separated list of fields to include into response or leave it undefined to return full object. If you select single field, response will be an array of values in both &#x60;.fields&#x60; and &#x60;.values&#x60; modes. (optional)
    * @param sort Sorts cycles by specified field. Supported fields: &#x60;index&#x60; (default, desc). (optional)
    * @param offset Specifies which or how many items should be skipped (optional)
    * @param limit Maximum number of items to return (optional, default to 100)
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return RequestConfig
    */
    fun cyclesGetRequestConfig(snapshotIndex: OneOfLessThanInt32ParameterGreaterThan?, select: OneOfLessThanSelectParameterGreaterThan?, sort: OneOfLessThanSortParameterGreaterThan?, offset: OneOfLessThanOffsetParameterGreaterThan?, limit: kotlin.Int?, quote: OneOfLessThanSymbolsGreaterThan?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (snapshotIndex != null) {
                    put("snapshotIndex", listOf(snapshotIndex.toString()))
                }
                if (select != null) {
                    put("select", listOf(select.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
                if (offset != null) {
                    put("offset", listOf(offset.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (quote != null) {
                    put("quote", listOf(quote.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/cycles",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get cycle by index
    * Returns a cycle at the specified index.
    * @param index Cycle index starting from zero 
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return Cycle
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cyclesGetByIndex(index: kotlin.Int, quote: OneOfLessThanSymbolsGreaterThan?) : Cycle {
        val localVarResponse = cyclesGetByIndexWithHttpInfo(index = index, quote = quote)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Cycle
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get cycle by index
    * Returns a cycle at the specified index.
    * @param index Cycle index starting from zero 
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return ApiResponse<Cycle?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun cyclesGetByIndexWithHttpInfo(index: kotlin.Int, quote: OneOfLessThanSymbolsGreaterThan?) : ApiResponse<Cycle?> {
        val localVariableConfig = cyclesGetByIndexRequestConfig(index = index, quote = quote)

        return request<Unit, Cycle>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation cyclesGetByIndex
    *
    * @param index Cycle index starting from zero 
    * @param quote Comma-separated list of ticker symbols to inject historical prices into response (optional)
    * @return RequestConfig
    */
    fun cyclesGetByIndexRequestConfig(index: kotlin.Int, quote: OneOfLessThanSymbolsGreaterThan?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (quote != null) {
                    put("quote", listOf(quote.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/cycles/{index}".replace("{"+"index"+"}", "$index"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get cycles count
    * Returns the total number of cycles, including future cycles.
    * @return kotlin.Int
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cyclesGetCount() : kotlin.Int {
        val localVarResponse = cyclesGetCountWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Int
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get cycles count
    * Returns the total number of cycles, including future cycles.
    * @return ApiResponse<kotlin.Int?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun cyclesGetCountWithHttpInfo() : ApiResponse<kotlin.Int?> {
        val localVariableConfig = cyclesGetCountRequestConfig()

        return request<Unit, kotlin.Int>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation cyclesGetCount
    *
    * @return RequestConfig
    */
    fun cyclesGetCountRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/cycles/count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
