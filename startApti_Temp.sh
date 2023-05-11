VM_OPTION=-Dspring.profiles.active=temp

echo "PID Check..."

CURRENT_PID=$(ps -ef | grep java | grep API-Parking-Partners-TEMP | awk '{print $2}')

echo "Running PID: {$CURRENT_PID}"

if [[ "" == "$CURRENT_PID" ]]; then
    echo "Project is not running"
else
    kill -9 $CURRENT_PID
    sleep 10
fi

echo "START APTi Parking API"

nohup java -jar $VM_OPTION ~/apipartner_Temp/API-Parking-Partners-TEMP*.jar >> ~/apipartner_Temp/apti_parking_partner_Temp.log &

echo "Done"

