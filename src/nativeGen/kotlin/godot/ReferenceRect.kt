// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ReferenceRect(
  _handle: COpaquePointer
) : Control(_handle) {
  var borderColor: Color
    get() {
       return getBorderColor() 
    }
    set(value) {
      setBorderColor(value)
    }

  var editorOnly: Boolean
    get() {
       return getEditorOnly() 
    }
    set(value) {
      setEditorOnly(value)
    }

  /**
   * Specialized setter for borderColor
   */
  fun borderColor(cb: Color.() -> Unit) {
    val _p = borderColor
    cb(_p)
    borderColor = _p
  }

  fun getBorderColor(): Color {
    val _ret = __method_bind.getBorderColor.call(this._handle)
    return _ret.asColor()
  }

  fun getEditorOnly(): Boolean {
    val _ret = __method_bind.getEditorOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBorderColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setBorderColor.call(this._handle, listOf(_arg))
  }

  fun setEditorOnly(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEditorOnly.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): ReferenceRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReferenceRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ReferenceRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ReferenceRect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ReferenceRect = ReferenceRect(ptr)
    /**
     * Container for method_bind pointers for ReferenceRect
     */
    private object __method_bind {
      val getBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
            "get_border_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_border_color" }
        }
      val getEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
            "get_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_editor_only" }
        }
      val setBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
            "set_border_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_border_color" }
        }
      val setEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReferenceRect".cstr.ptr,
            "set_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
        }}
  }
}
