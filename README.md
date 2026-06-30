# Google Feed Ads Patches

Experimental Morphe patch bundle for the Google app.

## ❓ About

This repository contains a prototype patch that hooks Google Discover stream
subtree creation and filters likely feed ad nodes before they reach the UI.

The first build is intentionally diagnostic: it logs compact samples of early
Discover nodes to `logcat` under `GoogleFeedAdsPatch`, which is needed to tune
the ad detector against real feed payloads.

## 📲 Add To Morphe

Click this link on your Android device:

https://morphe.software/add-source?github=Ripthulhu/morphe-google-patches

Or manually add this repository URL as a patch source in Morphe:

https://github.com/Ripthulhu/morphe-google-patches

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.
     
     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END 
     comment blocks entirely. -->

#### A list of your patches will be automatically shown here after your first patches release is created.

&nbsp;

<!-- PATCHES_END -->

### 🛠️ Building

Build with:

```bash
./gradlew buildAndroid
```

GitHub Actions publishes the `.mpp` bundle and updates `patches-bundle.json`
when commits are pushed to `main` or `dev`. If dependency resolution fails for
the Morphe Gradle plugin, add a repository secret named
`MORPHE_GITHUB_PACKAGES_TOKEN` with `read:packages` access for GitHub Packages.

## 📜 License

Google Feed Ads Patches are licensed under the [GNU General Public License v3.0](LICENSE)
