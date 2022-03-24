/**
* TzKT API
* # Introduction  TzKT Explorer provides free REST API and WebSocket API for accessing detailed Tezos blockchain data and helps developers build more services and applications on top of Tezos. TzKT is an open-source project, so you can easily clone and build it and use it as a self-hosted service to avoid any risks of depending on third-party services.  TzKT API is available for the following Tezos networks with the following base URLs:  - Mainnet: `https://api.tzkt.io/` or `https://api.mainnet.tzkt.io/` ([view docs](https://api.tzkt.io))  - Granadanet: `https://api.granadanet.tzkt.io/` ([view docs](https://api.granadanet.tzkt.io))     - Hangzhou2net: `https://api.hangzhou2net.tzkt.io/` ([view docs](https://api.hangzhou2net.tzkt.io))  We also provide a staging environment for testing newest features and pre-updating client applications before deploying to production:  - Mainnet staging: `https://staging.api.tzkt.io/` or `https://staging.api.mainnet.tzkt.io/` ([view docs](https://staging.api.tzkt.io))  Feel free to contact us if you have any questions or feature requests. Your feedback really helps us make TzKT better!  - Discord: https://discord.gg/aG8XKuwsQd - Telegram: https://t.me/baking_bad_chat - Slack: https://tezos-dev.slack.com/archives/CV5NX7F2L - Twitter: https://twitter.com/TezosBakingBad - Email: hello@baking-bad.org  And don't forget to star TzKT project [on GitHub](https://github.com/baking-bad/tzkt) ;)  # Terms of Use  TzKT API is free for everyone and for both commercial and non-commercial usage.  If your application or service uses the TzKT API in any forms: directly on frontend or indirectly on backend, you must mention that fact on your website or application by placing the label **\"Powered by TzKT API\"** or **\"Built with TzKT API\"** with a direct link to [tzkt.io](https://tzkt.io).   # Rate Limits  There will be no rate limits as long as our servers can handle the load without additional infrastructure costs. However, any apparent abuse will be prevented by setting targeted rate limits.  Check out [Tezos Explorer API Best Practices](https://baking-bad.org/blog/tag/TzKT/) and in particular [how to optimize requests count](https://baking-bad.org/blog/2020/07/29/tezos-explorer-api-tzkt-how-often-to-make-requests/).  --- 
*
* The version of the OpenAPI document: v1.7.0
* Contact: hello@baking-bad.org
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.rarible.protocol.tezos.api.util.tzkt.api.models

import com.squareup.moshi.Json
/**
 * 
 * @param id Internal TzKT id.   **[sortable]**
 * @param level Level of the block, at which the token transfer was made.   **[sortable]**
 * @param timestamp Timestamp of the block, at which the token transfer was made.
 * @param token Token info.   Click on the field to expand more details.
 * @param from Sender account.   Click on the field to expand more details.
 * @param to Target account.   Click on the field to expand more details.
 * @param amount Amount of tokens transferred (raw value, not divided by `decimals`).   **[sortable]**
 * @param transactionId Internal TzKT id of the transaction operation, caused the token transfer.
 * @param originationId Internal TzKT id of the origination operation, caused the token transfer.
 * @param migrationId Internal TzKT id of the migration operation, caused the token transfer.
 */

data class TokenTransfer (
    /* Internal TzKT id.   **[sortable]** */
    @Json(name = "id")
    var id: Int? = null,
    /* Level of the block, at which the token transfer was made.   **[sortable]** */
    @Json(name = "level")
    var level: Int? = null,
    /* Timestamp of the block, at which the token transfer was made. */
    @Json(name = "timestamp")
    var timestamp: java.time.OffsetDateTime? = null,
    /* Token info.   Click on the field to expand more details. */
    @Json(name = "token")
    var token: TokenInfo? = null,
    /* Sender account.   Click on the field to expand more details. */
    @Json(name = "from")
    var from: Alias? = null,
    /* Target account.   Click on the field to expand more details. */
    @Json(name = "to")
    var to: Alias? = null,
    /* Amount of tokens transferred (raw value, not divided by `decimals`).   **[sortable]** */
    @Json(name = "amount")
    var amount: String? = null,
    /* Internal TzKT id of the transaction operation, caused the token transfer. */
    @Json(name = "transactionId")
    var transactionId: Int? = null,
    /* Internal TzKT id of the origination operation, caused the token transfer. */
    @Json(name = "originationId")
    var originationId: Int? = null,
    /* Internal TzKT id of the migration operation, caused the token transfer. */
    @Json(name = "migrationId")
    var migrationId: Int? = null
)

