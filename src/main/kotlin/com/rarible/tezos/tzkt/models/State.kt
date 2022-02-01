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

package com.rarible.tezos.tzkt.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param chain Alias name of the chain (or \"private\" if it's not on the list of known chains)
 * @param chainId Unique identificator of the chain
 * @param cycle Current cycle
 * @param level The height of the last block from the genesis block
 * @param hash Block hash
 * @param protocol Current protocol hash
 * @param nextProtocol Next block protocol hash
 * @param timestamp The datetime at which the last block is claimed to have been created (ISO 8601, e.g. `2020-02-20T02:40:57Z`)
 * @param votingEpoch Current voring epoch index, starting from zero
 * @param votingPeriod Current voting period index, starting from zero
 * @param knownLevel The height of the last known block from the genesis block
 * @param lastSync The datetime of last TzKT indexer synchronization (ISO 8601, e.g. `2020-02-20T02:40:57Z`)
 * @param synced State of TzKT indexer synchronization
 * @param quoteLevel The height of the block where quotes were updated last time
 * @param quoteBtc Last known XTZ/BTC price
 * @param quoteEur Last known XTZ/EUR price
 * @param quoteUsd Last known XTZ/USD price
 * @param quoteCny Last known XTZ/CNY price
 * @param quoteJpy Last known XTZ/JPY price
 * @param quoteKrw Last known XTZ/KRW price
 * @param quoteEth Last known XTZ/ETH price
 * @param quoteGbp Last known XTZ/GBP price
 */

data class State (

    /* Alias name of the chain (or \"private\" if it's not on the list of known chains) */
    @Json(name = "chain")
    val chain: kotlin.String? = null,

    /* Unique identificator of the chain */
    @Json(name = "chainId")
    val chainId: kotlin.String? = null,

    /* Current cycle */
    @Json(name = "cycle")
    val cycle: kotlin.Int? = null,

    /* The height of the last block from the genesis block */
    @Json(name = "level")
    val level: kotlin.Int? = null,

    /* Block hash */
    @Json(name = "hash")
    val hash: kotlin.String? = null,

    /* Current protocol hash */
    @Json(name = "protocol")
    val protocol: kotlin.String? = null,

    /* Next block protocol hash */
    @Json(name = "nextProtocol")
    val nextProtocol: kotlin.String? = null,

    /* The datetime at which the last block is claimed to have been created (ISO 8601, e.g. `2020-02-20T02:40:57Z`) */
    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    /* Current voring epoch index, starting from zero */
    @Json(name = "votingEpoch")
    val votingEpoch: kotlin.Int? = null,

    /* Current voting period index, starting from zero */
    @Json(name = "votingPeriod")
    val votingPeriod: kotlin.Int? = null,

    /* The height of the last known block from the genesis block */
    @Json(name = "knownLevel")
    val knownLevel: kotlin.Int? = null,

    /* The datetime of last TzKT indexer synchronization (ISO 8601, e.g. `2020-02-20T02:40:57Z`) */
    @Json(name = "lastSync")
    val lastSync: java.time.OffsetDateTime? = null,

    /* State of TzKT indexer synchronization */
    @Json(name = "synced")
    val synced: kotlin.Boolean? = null,

    /* The height of the block where quotes were updated last time */
    @Json(name = "quoteLevel")
    val quoteLevel: kotlin.Int? = null,

    /* Last known XTZ/BTC price */
    @Json(name = "quoteBtc")
    val quoteBtc: kotlin.Double? = null,

    /* Last known XTZ/EUR price */
    @Json(name = "quoteEur")
    val quoteEur: kotlin.Double? = null,

    /* Last known XTZ/USD price */
    @Json(name = "quoteUsd")
    val quoteUsd: kotlin.Double? = null,

    /* Last known XTZ/CNY price */
    @Json(name = "quoteCny")
    val quoteCny: kotlin.Double? = null,

    /* Last known XTZ/JPY price */
    @Json(name = "quoteJpy")
    val quoteJpy: kotlin.Double? = null,

    /* Last known XTZ/KRW price */
    @Json(name = "quoteKrw")
    val quoteKrw: kotlin.Double? = null,

    /* Last known XTZ/ETH price */
    @Json(name = "quoteEth")
    val quoteEth: kotlin.Double? = null,

    /* Last known XTZ/GBP price */
    @Json(name = "quoteGbp")
    val quoteGbp: kotlin.Double? = null

)

