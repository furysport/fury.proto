//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/mint/v1beta1/mint.proto

package cosmos.mint.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun minter(block: cosmos.mint.v1beta1.MinterKt.Dsl.() -> Unit): cosmos.mint.v1beta1.Mint.Minter =
  cosmos.mint.v1beta1.MinterKt.Dsl._create(cosmos.mint.v1beta1.Mint.Minter.newBuilder()).apply { block() }._build()
object MinterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.mint.v1beta1.Mint.Minter.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.mint.v1beta1.Mint.Minter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.mint.v1beta1.Mint.Minter = _builder.build()

    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    var inflation: kotlin.String
      @JvmName("getInflation")
      get() = _builder.getInflation()
      @JvmName("setInflation")
      set(value) {
        _builder.setInflation(value)
      }
    /**
     * <pre>
     * current annual inflation rate
     * </pre>
     *
     * <code>string inflation = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    fun clearInflation() {
      _builder.clearInflation()
    }

    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     */
    var annualProvisions: kotlin.String
      @JvmName("getAnnualProvisions")
      get() = _builder.getAnnualProvisions()
      @JvmName("setAnnualProvisions")
      set(value) {
        _builder.setAnnualProvisions(value)
      }
    /**
     * <pre>
     * current annual expected provisions
     * </pre>
     *
     * <code>string annual_provisions = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"annual_provisions&#92;""];</code>
     */
    fun clearAnnualProvisions() {
      _builder.clearAnnualProvisions()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.mint.v1beta1.Mint.Minter.copy(block: cosmos.mint.v1beta1.MinterKt.Dsl.() -> Unit): cosmos.mint.v1beta1.Mint.Minter =
  cosmos.mint.v1beta1.MinterKt.Dsl._create(this.toBuilder()).apply { block() }._build()
