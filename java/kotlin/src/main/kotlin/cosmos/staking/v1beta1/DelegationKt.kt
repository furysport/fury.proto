//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun delegation(block: cosmos.staking.v1beta1.DelegationKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Staking.Delegation =
  cosmos.staking.v1beta1.DelegationKt.Dsl._create(cosmos.staking.v1beta1.Staking.Delegation.newBuilder()).apply { block() }._build()
object DelegationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.Staking.Delegation.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Staking.Delegation.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Staking.Delegation = _builder.build()

    /**
     * <pre>
     * delegator_address is the bech32-encoded address of the delegator.
     * </pre>
     *
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <pre>
     * delegator_address is the bech32-encoded address of the delegator.
     * </pre>
     *
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <pre>
     * validator_address is the bech32-encoded address of the validator.
     * </pre>
     *
     * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * validator_address is the bech32-encoded address of the validator.
     * </pre>
     *
     * <code>string validator_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <pre>
     * shares define the delegation shares received.
     * </pre>
     *
     * <code>string shares = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    var shares: kotlin.String
      @JvmName("getShares")
      get() = _builder.getShares()
      @JvmName("setShares")
      set(value) {
        _builder.setShares(value)
      }
    /**
     * <pre>
     * shares define the delegation shares received.
     * </pre>
     *
     * <code>string shares = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    fun clearShares() {
      _builder.clearShares()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.Staking.Delegation.copy(block: cosmos.staking.v1beta1.DelegationKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Staking.Delegation =
  cosmos.staking.v1beta1.DelegationKt.Dsl._create(this.toBuilder()).apply { block() }._build()
