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

open class BaseButton internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getActionMode(): ActionMode {
    val _ret = __method_bind.get_action_mode.call(this.toVariant())
    TODO()
  }

  fun getButtonGroup(): ButtonGroup {
    val _ret = __method_bind.get_button_group.call(this.toVariant())
    TODO()
  }

  fun getButtonMask(): Int {
    val _ret = __method_bind.get_button_mask.call(this.toVariant())
    TODO()
  }

  fun getDrawMode(): DrawMode {
    val _ret = __method_bind.get_draw_mode.call(this.toVariant())
    TODO()
  }

  fun getEnabledFocusMode(): Control.FocusMode {
    val _ret = __method_bind.get_enabled_focus_mode.call(this.toVariant())
    TODO()
  }

  fun getShortcut(): ShortCut {
    val _ret = __method_bind.get_shortcut.call(this.toVariant())
    TODO()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.is_disabled.call(this.toVariant())
    TODO()
  }

  fun isHovered(): Boolean {
    val _ret = __method_bind.is_hovered.call(this.toVariant())
    TODO()
  }

  fun isKeepPressedOutside(): Boolean {
    val _ret = __method_bind.is_keep_pressed_outside.call(this.toVariant())
    TODO()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.is_pressed.call(this.toVariant())
    TODO()
  }

  fun isShortcutInTooltipEnabled(): Boolean {
    val _ret = __method_bind.is_shortcut_in_tooltip_enabled.call(this.toVariant())
    TODO()
  }

  fun isToggleMode(): Boolean {
    val _ret = __method_bind.is_toggle_mode.call(this.toVariant())
    TODO()
  }

  fun setActionMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_action_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setButtonGroup(buttonGroup: ButtonGroup) {
    val _args = VariantArray.new()
    _args.append(buttonGroup)
    val _ret = __method_bind.set_button_group.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setButtonMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    val _ret = __method_bind.set_button_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDisabled(disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(disabled)
    val _ret = __method_bind.set_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEnabledFocusMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_enabled_focus_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setKeepPressedOutside(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_keep_pressed_outside.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPressed(pressed: Boolean) {
    val _args = VariantArray.new()
    _args.append(pressed)
    val _ret = __method_bind.set_pressed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShortcut(shortcut: ShortCut) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    val _ret = __method_bind.set_shortcut.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShortcutInTooltip(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_shortcut_in_tooltip.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setToggleMode(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_toggle_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class ActionMode(
    val value: Int
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

    ACTION_MODE_BUTTON_RELEASE(1);

    companion object {
      fun from(value: Int): ActionMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DrawMode(
    val value: Int
  ) {
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

    DRAW_HOVER_PRESSED(4);

    companion object {
      fun from(value: Int): DrawMode {
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
    val ACTION_MODE_BUTTON_PRESS: Int = 0

    val ACTION_MODE_BUTTON_RELEASE: Int = 1

    val DRAW_DISABLED: Int = 3

    val DRAW_HOVER: Int = 2

    val DRAW_HOVER_PRESSED: Int = 4

    val DRAW_NORMAL: Int = 0

    val DRAW_PRESSED: Int = 1

    /**
     * Container for method_bind pointers for BaseButton
     */
    private object __method_bind {
      val get_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
            }
          }

      val get_button_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_button_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_group" }
            }
          }

      val get_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
            }
          }

      val get_draw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_draw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_mode" }
            }
          }

      val get_enabled_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_enabled_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_enabled_focus_mode" }
            }
          }

      val get_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "get_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val is_hovered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_hovered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hovered" }
            }
          }

      val is_keep_pressed_outside: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_keep_pressed_outside".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_keep_pressed_outside" }
            }
          }

      val is_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pressed" }
            }
          }

      val is_shortcut_in_tooltip_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_shortcut_in_tooltip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shortcut_in_tooltip_enabled"
              }
            }
          }

      val is_toggle_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "is_toggle_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_toggle_mode" }
            }
          }

      val set_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
            }
          }

      val set_button_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_button_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_group" }
            }
          }

      val set_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_enabled_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_enabled_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled_focus_mode" }
            }
          }

      val set_keep_pressed_outside: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_keep_pressed_outside".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keep_pressed_outside" }
            }
          }

      val set_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed" }
            }
          }

      val set_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
            }
          }

      val set_shortcut_in_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_shortcut_in_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut_in_tooltip" }
            }
          }

      val set_toggle_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BaseButton".cstr.ptr,
              "set_toggle_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_toggle_mode" }
            }
          }
    }
  }
}
