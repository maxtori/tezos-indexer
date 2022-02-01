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

import com.rarible.tezos.tzkt.models.Alias
import com.rarible.tezos.tzkt.models.QuoteShort

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type Type of the operation, `baking` - an operation which contains brief information about a baked (produced) block (synthetic type)
 * @param id Unique ID of the operation, stored in the TzKT indexer database
 * @param level The height of the block from the genesis block
 * @param timestamp The datetime at which the block is claimed to have been created (ISO 8601, e.g. `2020-02-20T02:40:57Z`)
 * @param block Block hash
 * @param baker Information about a delegate (baker), produced the block
 * @param priority The position in the priority list of delegates at which the block was baked
 * @param deposit Security deposit frozen on the baker's account for producing the block (micro tez)
 * @param reward Reward of the baker for producing the block (micro tez)
 * @param fees Total fee paid by all operations, included in the block
 * @param quote Injected historical quote at the time of operation
 */

data class BakingOperationAllOf (

    /* Type of the operation, `baking` - an operation which contains brief information about a baked (produced) block (synthetic type) */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Unique ID of the operation, stored in the TzKT indexer database */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The height of the block from the genesis block */
    @Json(name = "level")
    val level: kotlin.Int? = null,

    /* The datetime at which the block is claimed to have been created (ISO 8601, e.g. `2020-02-20T02:40:57Z`) */
    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    /* Block hash */
    @Json(name = "block")
    val block: kotlin.String? = null,

    /* Information about a delegate (baker), produced the block */
    @Json(name = "baker")
    val baker: OneOfLessThanAliasGreaterThan? = null,

    /* The position in the priority list of delegates at which the block was baked */
    @Json(name = "priority")
    val priority: kotlin.Int? = null,

    /* Security deposit frozen on the baker's account for producing the block (micro tez) */
    @Json(name = "deposit")
    val deposit: kotlin.Long? = null,

    /* Reward of the baker for producing the block (micro tez) */
    @Json(name = "reward")
    val reward: kotlin.Long? = null,

    /* Total fee paid by all operations, included in the block */
    @Json(name = "fees")
    val fees: kotlin.Long? = null,

    /* Injected historical quote at the time of operation */
    @Json(name = "quote")
    val quote: OneOfLessThanQuoteShortGreaterThan? = null

)

