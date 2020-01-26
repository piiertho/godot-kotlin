// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OmniLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  fun getShadowDetail(): ShadowDetail {
    TODO()
  }

  fun getShadowMode(): ShadowMode {
    TODO()
  }

  fun setShadowDetail(detail: Int) {
    TODO()
  }

  fun setShadowMode(mode: Int) {
    TODO()
  }

  enum class ShadowMode(
    val value: Int
  ) {
    SHADOW_DUAL_PARABOLOID(0),

    SHADOW_CUBE(1);
  }

  enum class ShadowDetail(
    val value: Int
  ) {
    SHADOW_DETAIL_VERTICAL(0),

    SHADOW_DETAIL_HORIZONTAL(1);
  }

  companion object {
    val SHADOW_CUBE: Int = 1

    val SHADOW_DETAIL_HORIZONTAL: Int = 1

    val SHADOW_DETAIL_VERTICAL: Int = 0

    val SHADOW_DUAL_PARABOLOID: Int = 0

    fun new(): OmniLight = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OmniLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton OmniLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OmniLight(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for OmniLight
     */
    private object __method_bind {
      val get_shadow_detail: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
              "get_shadow_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_detail" }
            }
          }

      val get_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
              "get_shadow_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_mode" }
            }
          }

      val set_shadow_detail: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
              "set_shadow_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_detail" }
            }
          }

      val set_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
              "set_shadow_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_mode" }
            }
          }
    }
  }
}
