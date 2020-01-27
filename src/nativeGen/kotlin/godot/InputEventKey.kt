// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventKey internal constructor(
  _handle: COpaquePointer
) : InputEventWithModifiers(_handle) {
  fun getScancode(): Int {
    val _ret = __method_bind.get_scancode.call(this.toVariant())
    TODO()
  }

  fun getScancodeWithModifiers(): Int {
    val _ret = __method_bind.get_scancode_with_modifiers.call(this.toVariant())
    TODO()
  }

  fun getUnicode(): Int {
    val _ret = __method_bind.get_unicode.call(this.toVariant())
    TODO()
  }

  fun setEcho(echo: Boolean) {
    val _args = VariantArray.new()
    _args.append(echo)
    val _ret = __method_bind.set_echo.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPressed(pressed: Boolean) {
    val _args = VariantArray.new()
    _args.append(pressed)
    val _ret = __method_bind.set_pressed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setScancode(scancode: Int) {
    val _args = VariantArray.new()
    _args.append(scancode)
    val _ret = __method_bind.set_scancode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUnicode(unicode: Int) {
    val _args = VariantArray.new()
    _args.append(unicode)
    val _ret = __method_bind.set_unicode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): InputEventKey = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventKey".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventKey" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventKey(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventKey = InputEventKey(ptr)
    /**
     * Container for method_bind pointers for InputEventKey
     */
    private object __method_bind {
      val get_scancode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "get_scancode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scancode" }
            }
          }

      val get_scancode_with_modifiers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "get_scancode_with_modifiers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scancode_with_modifiers" }
            }
          }

      val get_unicode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "get_unicode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_unicode" }
            }
          }

      val set_echo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "set_echo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_echo" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val set_scancode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "set_scancode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scancode" }
            }
          }

      val set_unicode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventKey".cstr.ptr,
              "set_unicode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_unicode" }
            }
          }
    }
  }
}
