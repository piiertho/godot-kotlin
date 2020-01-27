// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tabs internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addTab(title: String, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(title)
    _args.append(icon)
    val _ret = __method_bind.add_tab.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun ensureTabVisible(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.ensure_tab_visible.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCurrentTab(): Int {
    val _ret = __method_bind.get_current_tab.call(this.toVariant())
    TODO()
  }

  fun getDragToRearrangeEnabled(): Boolean {
    val _ret = __method_bind.get_drag_to_rearrange_enabled.call(this.toVariant())
    TODO()
  }

  fun getOffsetButtonsVisible(): Boolean {
    val _ret = __method_bind.get_offset_buttons_visible.call(this.toVariant())
    TODO()
  }

  fun getScrollingEnabled(): Boolean {
    val _ret = __method_bind.get_scrolling_enabled.call(this.toVariant())
    TODO()
  }

  fun getSelectWithRmb(): Boolean {
    val _ret = __method_bind.get_select_with_rmb.call(this.toVariant())
    TODO()
  }

  fun getTabAlign(): TabAlign {
    val _ret = __method_bind.get_tab_align.call(this.toVariant())
    TODO()
  }

  fun getTabCloseDisplayPolicy(): CloseButtonDisplayPolicy {
    val _ret = __method_bind.get_tab_close_display_policy.call(this.toVariant())
    TODO()
  }

  fun getTabCount(): Int {
    val _ret = __method_bind.get_tab_count.call(this.toVariant())
    TODO()
  }

  fun getTabDisabled(tabIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.get_tab_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getTabIcon(tabIdx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.get_tab_icon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getTabOffset(): Int {
    val _ret = __method_bind.get_tab_offset.call(this.toVariant())
    TODO()
  }

  fun getTabRect(tabIdx: Int): Rect2 {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.get_tab_rect.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getTabTitle(tabIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.get_tab_title.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getTabsRearrangeGroup(): Int {
    val _ret = __method_bind.get_tabs_rearrange_group.call(this.toVariant())
    TODO()
  }

  fun moveTab(from: Int, to: Int) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.move_tab.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun removeTab(tabIdx: Int) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.remove_tab.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCurrentTab(tabIdx: Int) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    val _ret = __method_bind.set_current_tab.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDragToRearrangeEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_drag_to_rearrange_enabled.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setScrollingEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_scrolling_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSelectWithRmb(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_select_with_rmb.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTabAlign(align: Int) {
    val _args = VariantArray.new()
    _args.append(align)
    val _ret = __method_bind.set_tab_align.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTabCloseDisplayPolicy(policy: Int) {
    val _args = VariantArray.new()
    _args.append(policy)
    val _ret = __method_bind.set_tab_close_display_policy.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setTabDisabled(tabIdx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(disabled)
    val _ret = __method_bind.set_tab_disabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setTabIcon(tabIdx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(icon)
    val _ret = __method_bind.set_tab_icon.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setTabTitle(tabIdx: Int, title: String) {
    val _args = VariantArray.new()
    _args.append(tabIdx)
    _args.append(title)
    val _ret = __method_bind.set_tab_title.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setTabsRearrangeGroup(groupId: Int) {
    val _args = VariantArray.new()
    _args.append(groupId)
    val _ret = __method_bind.set_tabs_rearrange_group.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class CloseButtonDisplayPolicy(
    val value: Int
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

    CLOSE_BUTTON_MAX(3);

    companion object {
      fun from(value: Int): CloseButtonDisplayPolicy {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_MAX(3);

    companion object {
      fun from(value: Int): TabAlign {
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
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_MAX: Int = 3

    val ALIGN_RIGHT: Int = 2

    val CLOSE_BUTTON_MAX: Int = 3

    val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Int = 1

    val CLOSE_BUTTON_SHOW_ALWAYS: Int = 2

    val CLOSE_BUTTON_SHOW_NEVER: Int = 0

    fun new(): Tabs = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tabs".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Tabs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tabs(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tabs = Tabs(ptr)
    /**
     * Container for method_bind pointers for Tabs
     */
    private object __method_bind {
      val add_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "add_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_tab" }
            }
          }

      val ensure_tab_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "ensure_tab_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ensure_tab_visible" }
            }
          }

      val get_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_tab" }
            }
          }

      val get_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_to_rearrange_enabled"
              }
            }
          }

      val get_offset_buttons_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_offset_buttons_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset_buttons_visible" }
            }
          }

      val get_scrolling_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_scrolling_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scrolling_enabled" }
            }
          }

      val get_select_with_rmb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_select_with_rmb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_select_with_rmb" }
            }
          }

      val get_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_align" }
            }
          }

      val get_tab_close_display_policy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_close_display_policy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_close_display_policy" }
            }
          }

      val get_tab_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_count" }
            }
          }

      val get_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_disabled" }
            }
          }

      val get_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_icon" }
            }
          }

      val get_tab_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_offset" }
            }
          }

      val get_tab_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_rect" }
            }
          }

      val get_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_title" }
            }
          }

      val get_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "get_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tabs_rearrange_group" }
            }
          }

      val move_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "move_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_tab" }
            }
          }

      val remove_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "remove_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_tab" }
            }
          }

      val set_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_tab" }
            }
          }

      val set_drag_to_rearrange_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_drag_to_rearrange_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_to_rearrange_enabled"
              }
            }
          }

      val set_scrolling_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_scrolling_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scrolling_enabled" }
            }
          }

      val set_select_with_rmb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_select_with_rmb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_select_with_rmb" }
            }
          }

      val set_tab_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_align" }
            }
          }

      val set_tab_close_display_policy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_close_display_policy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_close_display_policy" }
            }
          }

      val set_tab_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_disabled" }
            }
          }

      val set_tab_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_icon" }
            }
          }

      val set_tab_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tab_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_title" }
            }
          }

      val set_tabs_rearrange_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tabs".cstr.ptr,
              "set_tabs_rearrange_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tabs_rearrange_group" }
            }
          }
    }
  }
}
