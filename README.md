# meta-nbtscan Yocto Layer
This layer includes a recipe `nbtscan` for building the `nbtscan` CLI tool which is used to scan networks for NetBIOS name information.

The `nbtscan` CLI tool is no longer maintained by its original developers. It is now developed by [resurrecting-open-source-projects](https://github.com/resurrecting-open-source-projects) at: https://github.com/resurrecting-open-source-projects/nbtscan.

## Adding the meta-nbtscan layer to your build
* Clone this layer into your sources directory
* Run `bitbake-layers add-layer <sources directory path>/meta-nbtscan`
* Add `IMAGE_INSTALL_append += " nbtscan"` to `local.conf` to include the `nbtscan` recipe in your image
