package com.nsc9012.bluetooth.devices

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.nsc9012.bluetooth.R
import com.nsc9012.bluetooth.extension.inflate
import kotlinx.android.synthetic.main.adapter_discovered_devices.view.*

class DevicesAdapter : RecyclerView.Adapter<DevicesAdapter.ViewHolder>() {

    //private val devices = ArrayList<BluetoothDevice>()
      private val devices = ArrayList<String>()

    override fun onCreateViewHolder(container: ViewGroup, viewType: Int) = ViewHolder(
        container.inflate(R.layout.adapter_discovered_devices)
    )

    override fun getItemCount() = devices.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        //viewHolder.bind(devices[position])
        viewHolder.bind(devices[position])
    }

    //fun addDevice(device: BluetoothDevice) {
    fun addDevice(device: String) {
        devices.add(device)
        notifyItemInserted(itemCount)
    }

    fun clearDevices() {
        devices.clear()
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(device: String) {
            //view.text_view_device_name.text = device.name ?: device.address
            view.text_view_device_name.text = device
        }

    }
}