// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
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

open class DynamicFont internal constructor(
  _handle: COpaquePointer
) : Font(_handle) {
  fun addFallback(data: DynamicFontData) {
    val _args = VariantArray.new()
    _args.append(data)
    val _ret = __method_bind.add_fallback.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFallback(idx: Int): DynamicFontData {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_fallback.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFallbackCount(): Int {
    val _ret = __method_bind.get_fallback_count.call(this.toVariant())
    TODO()
  }

  fun getFontData(): DynamicFontData {
    val _ret = __method_bind.get_font_data.call(this.toVariant())
    TODO()
  }

  fun getOutlineColor(): Color {
    val _ret = __method_bind.get_outline_color.call(this.toVariant())
    TODO()
  }

  fun getOutlineSize(): Int {
    val _ret = __method_bind.get_outline_size.call(this.toVariant())
    TODO()
  }

  fun getSize(): Int {
    val _ret = __method_bind.get_size.call(this.toVariant())
    TODO()
  }

  fun getSpacing(type: Int): Int {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.get_spacing.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getUseFilter(): Boolean {
    val _ret = __method_bind.get_use_filter.call(this.toVariant())
    TODO()
  }

  fun getUseMipmaps(): Boolean {
    val _ret = __method_bind.get_use_mipmaps.call(this.toVariant())
    TODO()
  }

  fun removeFallback(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.remove_fallback.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFallback(idx: Int, data: DynamicFontData) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(data)
    val _ret = __method_bind.set_fallback.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setFontData(data: DynamicFontData) {
    val _args = VariantArray.new()
    _args.append(data)
    val _ret = __method_bind.set_font_data.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOutlineColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    val _ret = __method_bind.set_outline_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOutlineSize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_outline_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSize(data: Int) {
    val _args = VariantArray.new()
    _args.append(data)
    val _ret = __method_bind.set_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSpacing(type: Int, value: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(value)
    val _ret = __method_bind.set_spacing.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setUseFilter(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_filter.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseMipmaps(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_mipmaps.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class SpacingType(
    val value: Int
  ) {
    SPACING_TOP(0),

    SPACING_BOTTOM(1),

    SPACING_CHAR(2),

    SPACING_SPACE(3);

    companion object {
      fun from(value: Int): SpacingType {
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
    val SPACING_BOTTOM: Int = 1

    val SPACING_CHAR: Int = 2

    val SPACING_SPACE: Int = 3

    val SPACING_TOP: Int = 0

    fun new(): DynamicFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton DynamicFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DynamicFont(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): DynamicFont = DynamicFont(ptr)
    /**
     * Container for method_bind pointers for DynamicFont
     */
    private object __method_bind {
      val add_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "add_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_fallback" }
            }
          }

      val get_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fallback" }
            }
          }

      val get_fallback_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_fallback_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fallback_count" }
            }
          }

      val get_font_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_font_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_font_data" }
            }
          }

      val get_outline_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_outline_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline_color" }
            }
          }

      val get_outline_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_outline_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline_size" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_spacing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_spacing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spacing" }
            }
          }

      val get_use_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_use_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_filter" }
            }
          }

      val get_use_mipmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "get_use_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_mipmaps" }
            }
          }

      val remove_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "remove_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_fallback" }
            }
          }

      val set_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fallback" }
            }
          }

      val set_font_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_font_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_font_data" }
            }
          }

      val set_outline_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_outline_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outline_color" }
            }
          }

      val set_outline_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_outline_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outline_size" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_spacing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_spacing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spacing" }
            }
          }

      val set_use_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_use_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_filter" }
            }
          }

      val set_use_mipmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
              "set_use_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_mipmaps" }
            }
          }
    }
  }
}
