// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectSpectrumAnalyzerInstance(
  _handle: COpaquePointer
) : AudioEffectInstance(_handle) {
  fun getMagnitudeForFrequencyRange(
    fromHz: Float,
    toHz: Float,
    mode: Int = 1
  ): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromHz))
    _args.add(Variant.fromAny(toHz))
    _args.add(Variant.fromAny(mode))
    val _ret = __method_bind.getMagnitudeForFrequencyRange.call(this._handle, _args)
    return _ret.asVector2()
  }

  enum class MagnitudeMode(
    val value: Int
  ) {
    MAGNITUDE_AVERAGE(0),

    MAGNITUDE_MAX(1);

    companion object {
      fun from(value: Int): MagnitudeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MAGNITUDE_AVERAGE: Int = 0

    val MAGNITUDE_MAX: Int = 1

    /**
     * Container for method_bind pointers for AudioEffectSpectrumAnalyzerInstance
     */
    private object __method_bind {
      val getMagnitudeForFrequencyRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzerInstance".cstr.ptr,
            "get_magnitude_for_frequency_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_magnitude_for_frequency_range"
            }
        }}
  }
}
