// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class OmniLight(
  _handle: COpaquePointer
) : Light(_handle) {
  var omniAttenuation: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var omniRange: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var omniShadowDetail: ShadowDetail
    get() {
       return getShadowDetail() 
    }
    set(value) {
      setShadowDetail(value.value)
    }

  var omniShadowMode: ShadowMode
    get() {
       return getShadowMode() 
    }
    set(value) {
      setShadowMode(value.value)
    }

  fun getShadowDetail(): ShadowDetail {
    val _ret = __method_bind.getShadowDetail.call(this._handle)
    return OmniLight.ShadowDetail.from(_ret.asInt())
  }

  fun getShadowMode(): ShadowMode {
    val _ret = __method_bind.getShadowMode.call(this._handle)
    return OmniLight.ShadowMode.from(_ret.asInt())
  }

  fun setShadowDetail(detail: Int) {
    val _arg = Variant.new(detail)
    __method_bind.setShadowDetail.call(this._handle, listOf(_arg))
  }

  fun setShadowMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setShadowMode.call(this._handle, listOf(_arg))
  }

  enum class ShadowMode(
    val value: Int
  ) {
    SHADOW_DUAL_PARABOLOID(0),

    SHADOW_CUBE(1);

    companion object {
      fun from(value: Int): ShadowMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShadowDetail(
    val value: Int
  ) {
    SHADOW_DETAIL_VERTICAL(0),

    SHADOW_DETAIL_HORIZONTAL(1);

    companion object {
      fun from(value: Int): ShadowDetail {
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
    val SHADOW_CUBE: Int = 1

    val SHADOW_DETAIL_HORIZONTAL: Int = 1

    val SHADOW_DETAIL_VERTICAL: Int = 0

    val SHADOW_DUAL_PARABOLOID: Int = 0

    fun new(): OmniLight = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OmniLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OmniLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OmniLight(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): OmniLight = OmniLight(ptr)
    /**
     * Container for method_bind pointers for OmniLight
     */
    private object __method_bind {
      val getShadowDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "get_shadow_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_detail" }
        }
      val getShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "get_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_mode" }
        }
      val setShadowDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "set_shadow_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_detail" }
        }
      val setShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "set_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_mode" }
        }}
  }
}
