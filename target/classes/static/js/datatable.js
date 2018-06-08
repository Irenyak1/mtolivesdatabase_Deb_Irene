$(document).ready(function(){
    var table = $('#membersTable').DataTable({

                "sAjaxSource": "/members",
                "sAjaxDataProp":"",
                "order":[[0,"asc"]],
                "aoColumns":[
                    { "mData":"id"},
                    { "mData":"name"},
                    { "mData":"gender"},
                    { "mData":"dateofbirth"},
                    { "mData":"maritalstatus"},
                    { "mData":"churchfamily"},
                    { "mData":"fellowshipgroup"},
                    { "mData":"highestlevelofeducation"},
                    { "mData":"profession"},
                    { "mData":"occupation"},
                    { "mData":"placeofwork"},
                    { "mData":"placeofresidence"},
                    { "mData":"phonecontact"},
                    { "mData":"emailaddress"},
                    { "mData":"dateofbaptism"},
                    { "mData":"placeofbaptism"},
                    { "mData":"nameofpastorwhobaptised"},
                    { "mData":"formerreligion"},
                    { "mData":"image_url"},
                ]
    })





});