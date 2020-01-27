// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PopupMenu internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  fun addCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    val _ret = __method_bind.add_check_item.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    val _ret = __method_bind.add_check_shortcut.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addIconCheckItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    val _ret = __method_bind.add_icon_check_item.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun addIconCheckShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    val _ret = __method_bind.add_icon_check_shortcut.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun addIconItem(
    texture: Texture,
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    val _ret = __method_bind.add_icon_item.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun addIconShortcut(
    texture: Texture,
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    val _ret = __method_bind.add_icon_shortcut.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun addItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    val _ret = __method_bind.add_item.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addRadioCheckItem(
    label: String,
    id: Int,
    accel: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(id)
    _args.append(accel)
    val _ret = __method_bind.add_radio_check_item.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addRadioCheckShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    val _ret = __method_bind.add_radio_check_shortcut.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addSeparator(label: String) {
    val _args = VariantArray.new()
    _args.append(label)
    val _ret = __method_bind.add_separator.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addShortcut(
    shortcut: ShortCut,
    id: Int,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(shortcut)
    _args.append(id)
    _args.append(global)
    val _ret = __method_bind.add_shortcut.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addSubmenuItem(
    label: String,
    submenu: String,
    id: Int
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(submenu)
    _args.append(id)
    val _ret = __method_bind.add_submenu_item.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun getAllowSearch(): Boolean {
    val _ret = __method_bind.get_allow_search.call(this.toVariant())
    TODO()
  }

  fun getItemAccelerator(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_accelerator.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemCount(): Int {
    val _ret = __method_bind.get_item_count.call(this.toVariant())
    TODO()
  }

  fun getItemIcon(idx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_icon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemId(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_id.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemIndex(id: Int): Int {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemMetadata(idx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_metadata.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemShortcut(idx: Int): ShortCut {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_shortcut.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemSubmenu(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_submenu.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemText(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_text.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemTooltip(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_item_tooltip.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getSubmenuPopupDelay(): Float {
    val _ret = __method_bind.get_submenu_popup_delay.call(this.toVariant())
    TODO()
  }

  fun isHideOnCheckableItemSelection(): Boolean {
    val _ret = __method_bind.is_hide_on_checkable_item_selection.call(this.toVariant())
    TODO()
  }

  fun isHideOnItemSelection(): Boolean {
    val _ret = __method_bind.is_hide_on_item_selection.call(this.toVariant())
    TODO()
  }

  fun isHideOnStateItemSelection(): Boolean {
    val _ret = __method_bind.is_hide_on_state_item_selection.call(this.toVariant())
    TODO()
  }

  fun isHideOnWindowLoseFocus(): Boolean {
    val _ret = __method_bind.is_hide_on_window_lose_focus.call(this.toVariant())
    TODO()
  }

  fun isItemCheckable(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_checkable.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isItemChecked(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_checked.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isItemDisabled(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isItemRadioCheckable(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_radio_checkable.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isItemSeparator(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_separator.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isItemShortcutDisabled(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_item_shortcut_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeItem(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.remove_item.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAllowSearch(allow: Boolean) {
    val _args = VariantArray.new()
    _args.append(allow)
    val _ret = __method_bind.set_allow_search.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHideOnCheckableItemSelection(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_hide_on_checkable_item_selection.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setHideOnItemSelection(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_hide_on_item_selection.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHideOnStateItemSelection(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_hide_on_state_item_selection.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setHideOnWindowLoseFocus(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_hide_on_window_lose_focus.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setItemAccelerator(idx: Int, accel: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(accel)
    val _ret = __method_bind.set_item_accelerator.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemAsCheckable(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    val _ret = __method_bind.set_item_as_checkable.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemAsRadioCheckable(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    val _ret = __method_bind.set_item_as_radio_checkable.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun setItemAsSeparator(idx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enable)
    val _ret = __method_bind.set_item_as_separator.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemChecked(idx: Int, checked: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(checked)
    val _ret = __method_bind.set_item_checked.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    val _ret = __method_bind.set_item_disabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemIcon(idx: Int, icon: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(icon)
    val _ret = __method_bind.set_item_icon.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemId(idx: Int, id: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(id)
    val _ret = __method_bind.set_item_id.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemMetadata(idx: Int, metadata: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(metadata)
    val _ret = __method_bind.set_item_metadata.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemMultistate(idx: Int, state: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(state)
    val _ret = __method_bind.set_item_multistate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemShortcut(
    idx: Int,
    shortcut: ShortCut,
    global: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(shortcut)
    _args.append(global)
    val _ret = __method_bind.set_item_shortcut.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun setItemShortcutDisabled(idx: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(disabled)
    val _ret = __method_bind.set_item_shortcut_disabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemSubmenu(idx: Int, submenu: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(submenu)
    val _ret = __method_bind.set_item_submenu.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemText(idx: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(text)
    val _ret = __method_bind.set_item_text.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemTooltip(idx: Int, tooltip: String) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tooltip)
    val _ret = __method_bind.set_item_tooltip.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setSubmenuPopupDelay(seconds: Float) {
    val _args = VariantArray.new()
    _args.append(seconds)
    val _ret = __method_bind.set_submenu_popup_delay.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun toggleItemChecked(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.toggle_item_checked.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun toggleItemMultistate(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.toggle_item_multistate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): PopupMenu = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PopupMenu".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PopupMenu" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PopupMenu(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PopupMenu = PopupMenu(ptr)
    /**
     * Container for method_bind pointers for PopupMenu
     */
    private object __method_bind {
      val add_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_check_item" }
            }
          }

      val add_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_check_shortcut" }
            }
          }

      val add_icon_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_check_item" }
            }
          }

      val add_icon_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_check_shortcut" }
            }
          }

      val add_icon_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_item" }
            }
          }

      val add_icon_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_icon_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_shortcut" }
            }
          }

      val add_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_item" }
            }
          }

      val add_radio_check_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_radio_check_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_radio_check_item" }
            }
          }

      val add_radio_check_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_radio_check_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_radio_check_shortcut" }
            }
          }

      val add_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_separator" }
            }
          }

      val add_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_shortcut" }
            }
          }

      val add_submenu_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "add_submenu_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_submenu_item" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_allow_search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_allow_search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_allow_search" }
            }
          }

      val get_item_accelerator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_accelerator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_accelerator" }
            }
          }

      val get_item_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_count" }
            }
          }

      val get_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_icon" }
            }
          }

      val get_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_id" }
            }
          }

      val get_item_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_index" }
            }
          }

      val get_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_metadata" }
            }
          }

      val get_item_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_shortcut" }
            }
          }

      val get_item_submenu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_submenu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_submenu" }
            }
          }

      val get_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_text" }
            }
          }

      val get_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_tooltip" }
            }
          }

      val get_submenu_popup_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "get_submenu_popup_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_submenu_popup_delay" }
            }
          }

      val is_hide_on_checkable_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_checkable_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_hide_on_checkable_item_selection" }
            }
          }

      val is_hide_on_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_item_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hide_on_item_selection" }
            }
          }

      val is_hide_on_state_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_state_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_hide_on_state_item_selection" }
            }
          }

      val is_hide_on_window_lose_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_hide_on_window_lose_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hide_on_window_lose_focus" }
            }
          }

      val is_item_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_checkable" }
            }
          }

      val is_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_checked" }
            }
          }

      val is_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_disabled" }
            }
          }

      val is_item_radio_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_radio_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_radio_checkable" }
            }
          }

      val is_item_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_separator" }
            }
          }

      val is_item_shortcut_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "is_item_shortcut_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_item_shortcut_disabled" }
            }
          }

      val remove_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val set_allow_search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_allow_search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_search" }
            }
          }

      val set_hide_on_checkable_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_checkable_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_hide_on_checkable_item_selection" }
            }
          }

      val set_hide_on_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_item_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_item_selection" }
            }
          }

      val set_hide_on_state_item_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_state_item_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_hide_on_state_item_selection" }
            }
          }

      val set_hide_on_window_lose_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_hide_on_window_lose_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_window_lose_focus"
              }
            }
          }

      val set_item_accelerator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_accelerator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_accelerator" }
            }
          }

      val set_item_as_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_checkable" }
            }
          }

      val set_item_as_radio_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_radio_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_radio_checkable" }
            }
          }

      val set_item_as_separator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_as_separator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_as_separator" }
            }
          }

      val set_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_checked" }
            }
          }

      val set_item_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_disabled" }
            }
          }

      val set_item_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_icon" }
            }
          }

      val set_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_id" }
            }
          }

      val set_item_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_metadata" }
            }
          }

      val set_item_multistate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_multistate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_multistate" }
            }
          }

      val set_item_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shortcut" }
            }
          }

      val set_item_shortcut_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_shortcut_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shortcut_disabled" }
            }
          }

      val set_item_submenu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_submenu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_submenu" }
            }
          }

      val set_item_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_text" }
            }
          }

      val set_item_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_item_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_tooltip" }
            }
          }

      val set_submenu_popup_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "set_submenu_popup_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_submenu_popup_delay" }
            }
          }

      val toggle_item_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "toggle_item_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method toggle_item_checked" }
            }
          }

      val toggle_item_multistate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PopupMenu".cstr.ptr,
              "toggle_item_multistate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method toggle_item_multistate" }
            }
          }
    }
  }
}
