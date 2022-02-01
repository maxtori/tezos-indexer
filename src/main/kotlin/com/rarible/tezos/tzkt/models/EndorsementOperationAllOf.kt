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
 * @param type Type of the operation, `endorsement` - is operation, which specifies the head of the chain as seen by the endorser of a given slot. The endorser is randomly selected to be included in the block that extends the head of the chain as specified in this operation. A block with more endorsements improves the weight of the chain and increases the likelihood of that chain being the canonical one.
 * @param id Unique ID of the operation, stored in the TzKT indexer database
 * @param level The height of the block from the genesis block, in which the operation was included
 * @param timestamp Datetime of the block, in which the operation was included (ISO 8601, e.g. `2020-02-20T02:40:57Z`)
 * @param block Hash of the block, in which the operation was included
 * @param hash Hash of the operation
 * @param `delegate` Information about the baker (delegate) who sent the operation
 * @param slots Number of assigned endorsement slots (out of 32) to the baker (delegate) who sent the operation
 * @param deposit Security deposit frozen on the baker's account
 * @param rewards Reward of the baker (delegate) for the operation
 * @param quote Injected historical quote at the time of operation
 */

data class EndorsementOperationAllOf (

    /* Type of the operation, `endorsement` - is operation, which specifies the head of the chain as seen by the endorser of a given slot. The endorser is randomly selected to be included in the block that extends the head of the chain as specified in this operation. A block with more endorsements improves the weight of the chain and increases the likelihood of that chain being the canonical one. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* Unique ID of the operation, stored in the TzKT indexer database */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The height of the block from the genesis block, in which the operation was included */
    @Json(name = "level")
    val level: kotlin.Int? = null,

    /* Datetime of the block, in which the operation was included (ISO 8601, e.g. `2020-02-20T02:40:57Z`) */
    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    /* Hash of the block, in which the operation was included */
    @Json(name = "block")
    val block: kotlin.String? = null,

    /* Hash of the operation */
    @Json(name = "hash")
    val hash: kotlin.String? = null,

    /* Information about the baker (delegate) who sent the operation */
    @Json(name = "delegate")
    val `delegate`: OneOfLessThanAliasGreaterThan? = null,

    /* Number of assigned endorsement slots (out of 32) to the baker (delegate) who sent the operation */
    @Json(name = "slots")
    val slots: kotlin.Int? = null,

    /* Security deposit frozen on the baker's account */
    @Json(name = "deposit")
    val deposit: kotlin.Long? = null,

    /* Reward of the baker (delegate) for the operation */
    @Json(name = "rewards")
    val rewards: kotlin.Long? = null,

    /* Injected historical quote at the time of operation */
    @Json(name = "quote")
    val quote: OneOfLessThanQuoteShortGreaterThan? = null

)

