$(document).ready(function() {
  $("#hp").focusout(function() {
    var hpv = $("#hp").val();
    var mpv = $("#mp").val();
    var spv = $("#sp").val();
    if (hpv > 62) {
      $("#hpTooltip").css("opacity", "1");
      $("#hpTooltip").attr("data-tooltip", "Can't be more than 64");
      setTimeout(function() {
        $("#hpTooltip").css("opacity", "0");
      }, 2000);
    } else if (mpv > 64 || spv > 64 || ((mpv + spv) > 64) || ((hpv + mpv) > 64) || ((hpv + spv) > 64)) {
      $("#hpTooltip").css("opacity", "1");
      $("#hpTooltip").attr("data-tooltip", "Sum of all attributes can't be more than 64");
      setTimeout(function() {
        $("#hpTooltip").css("opacity", "0");
      }, 2000);
    }
  });

  $("#mp").focusout(function() {
      var hpv = $("#hp").val();
      var mpv = $("#mp").val();
      var spv = $("#sp").val();
      if (mpv > 62) {
        $("#mpTooltip").css("opacity", "1");
        $("#mpTooltip").attr("data-tooltip", "Can't be more than 64");
        setTimeout(function() {
          $("#mpTooltip").css("opacity", "0");
        }, 2000);
      } else if (hpv > 64 || spv > 64 || ((mpv + spv) > 64) || ((hpv + mpv) > 64) || ((hpv + spv) > 64)) {
        $("#mpTooltip").css("opacity", "1");
        $("#mpTooltip").attr("data-tooltip", "Sum of all attributes can't be more than 64");
        setTimeout(function() {
          $("#mpTooltip").css("opacity", "0");
        }, 2000);
      }
    });

    $("#sp").focusout(function() {
        var hpv = $("#hp").val();
        var mpv = $("#mp").val();
        var spv = $("#sp").val();
        if (spv > 62) {
          $("#spTooltip").css("opacity", "1");
          $("#spTooltip").attr("data-tooltip", "Can't be more than 64");
          setTimeout(function() {
            $("#spTooltip").css("opacity", "0");
          }, 2000);
        } else if (mpv > 64 || hpv > 64 || ((mpv + spv) > 64) || ((hpv + mpv) > 64) || ((hpv + spv) > 64)) {
          $("#spTooltip").css("opacity", "1");
          $("#spTooltip").attr("data-tooltip", "Sum of all attributes can't be more than 64");
          setTimeout(function() {
            $("#spTooltip").css("opacity", "0");
          }, 2000);
        }
      });
});