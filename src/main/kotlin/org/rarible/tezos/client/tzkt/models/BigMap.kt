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

package org.rarible.tezos.client.tzkt.models

import org.rarible.tezos.client.tzkt.models.Alias

import com.squareup.moshi.Json

/**
 * 
 *
 * @param ptr Bigmap pointer
 * @param contract Smart contract in which's storage the bigmap is allocated
 * @param path Path to the bigmap in the contract storage 
 * @param tags List of tags (`token_metadata` - tzip-12, `metadata` - tzip-16, `null` - no tags)
 * @param active Bigmap status (`true` - active, `false` - removed)
 * @param firstLevel Level of the block where the bigmap was seen first time
 * @param lastLevel Level of the block where the bigmap was seen last time
 * @param totalKeys Total number of keys ever added to the bigmap
 * @param activeKeys Total number of currently active keys
 * @param updates Total number of actions with the bigmap
 * @param keyType Bigmap key type as JSON schema or Micheline, depending on the `micheline` query parameter.
 * @param valueType Bigmap value type as JSON schema or Micheline, depending on the `micheline` query parameter.
 */

data class BigMap (

    /* Bigmap pointer */
    @Json(name = "ptr")
    val ptr: kotlin.Int? = null,

    /* Smart contract in which's storage the bigmap is allocated */
    @Json(name = "contract")
    val contract: Alias? = null,

    /* Path to the bigmap in the contract storage  */
    @Json(name = "path")
    val path: kotlin.String? = null,

    /* List of tags (`token_metadata` - tzip-12, `metadata` - tzip-16, `null` - no tags) */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* Bigmap status (`true` - active, `false` - removed) */
    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    /* Level of the block where the bigmap was seen first time */
    @Json(name = "firstLevel")
    val firstLevel: kotlin.Int? = null,

    /* Level of the block where the bigmap was seen last time */
    @Json(name = "lastLevel")
    val lastLevel: kotlin.Int? = null,

    /* Total number of keys ever added to the bigmap */
    @Json(name = "totalKeys")
    val totalKeys: kotlin.Int? = null,

    /* Total number of currently active keys */
    @Json(name = "activeKeys")
    val activeKeys: kotlin.Int? = null,

    /* Total number of actions with the bigmap */
    @Json(name = "updates")
    val updates: kotlin.Int? = null,

    /* Bigmap key type as JSON schema or Micheline, depending on the `micheline` query parameter. */
    @Json(name = "keyType")
    val keyType: kotlin.Any? = null,

    /* Bigmap value type as JSON schema or Micheline, depending on the `micheline` query parameter. */
    @Json(name = "valueType")
    val valueType: kotlin.Any? = null

)
