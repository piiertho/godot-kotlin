// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getCubicInterpolation(): Boolean {
    TODO()
  }

  fun getHOffset(): Float {
    TODO()
  }

  fun getOffset(): Float {
    TODO()
  }

  fun getRotationMode(): PathFollow.RotationMode {
    TODO()
  }

  fun getUnitOffset(): Float {
    TODO()
  }

  fun getVOffset(): Float {
    TODO()
  }

  fun hasLoop(): Boolean {
    TODO()
  }

  fun setCubicInterpolation() {
    TODO()
  }

  fun setHOffset() {
    TODO()
  }

  fun setLoop() {
    TODO()
  }

  fun setOffset() {
    TODO()
  }

  fun setRotationMode() {
    TODO()
  }

  fun setUnitOffset() {
    TODO()
  }

  fun setVOffset() {
    TODO()
  }

  enum class RotationMode(
    val value: Int
  ) {
    ROTATION_NONE(0),

    ROTATION_Y(1),

    ROTATION_XY(2),

    ROTATION_XYZ(3),

    ROTATION_ORIENTED(4);
  }

  companion object {
    val ROTATION_NONE: Int = 0

    val ROTATION_ORIENTED: Int = 4

    val ROTATION_XY: Int = 2

    val ROTATION_XYZ: Int = 3

    val ROTATION_Y: Int = 1

    fun new(): PathFollow = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PathFollow" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PathFollow(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PathFollow
     */
    private object __method_bind {
      val get_cubic_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_cubic_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cubic_interpolation" }
            }
          }

      val get_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_rotation_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_rotation_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_mode" }
            }
          }

      val get_unit_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_unit_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_unit_offset" }
            }
          }

      val get_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "get_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
            }
          }

      val has_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "has_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_loop" }
            }
          }

      val set_cubic_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_cubic_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cubic_interpolation" }
            }
          }

      val set_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
            }
          }

      val set_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_rotation_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_rotation_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_mode" }
            }
          }

      val set_unit_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_unit_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_unit_offset" }
            }
          }

      val set_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
              "set_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
            }
          }
    }
  }
}
